package com.gupaoedu.vip.pattern.delegate.mvc;

import com.gupaoedu.vip.pattern.delegate.mvc.controller.MemberController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 * 相当于是项目经理的角色
 **/
public class DispatcherServlet {

    private List<Handler> handlerMapping = new ArrayList<Handler>();

    public void init() throws Exception{
        try{
            Class<?> memberControllerClass = MemberController.class;
            handlerMapping.add(new Handler()
                    .setController(memberControllerClass.newInstance())
                    .setMethod(memberControllerClass.getMethod("getMemberById",new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        }catch (Exception e){

        }
    }

    private void doDispatch(HttpServletRequest request, HttpServletResponse response){

        //1.获取请求的url，每个url对应一个servlet，url由浏览器输入
        String uri = request.getRequestURI();

        //2.Servlet拿到rul后，做权衡判断，根据yrl找到对应的某个类方法

        //3.通过拿到的url去handlerMapping（我们认为这是策略常量）
        Handler handle = null;
        for (Handler h: handlerMapping) {
            if (uri.equals(h.getUrl())){
                handle = h;
                break;
            }
        }

        //4.讲具体的任务分发给Method（通过反射去调用其它对应的方法）
        Object object = null;
        try{
            object = handle.getMethod().invoke(handle.getController(),request.getParameter("mid"));
        }catch (Exception e){
            e.printStackTrace();
        }
        //5.获取Method执行结果，通过response返回去
        //response.getWriter().write();
    }

    protected void service(HttpServletRequest req,HttpServletResponse resp){
        try{
            doDispatch(req,resp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //内部类
    class Handler{

        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }


}
