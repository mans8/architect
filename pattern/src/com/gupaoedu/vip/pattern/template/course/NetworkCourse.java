package com.gupaoedu.vip.pattern.template.course;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public abstract class NetworkCourse {

    protected final void createCourse(){

        //1.发布预习资料
        this.postPreResource();

        //2.制作ppt课件
        this.creatPPT();

        //3.在线直播
        this.liveVideo();

        //4.提交课件
        this.postNote();

        //5.提交源码
        this.postSource();

        //6.布置作业，如果有作业就检查作业，没有就结束
        if (needHomework()){
            checkHomework();
        }

    }

    abstract void checkHomework();

    //钩子方法，实现流程微调
    protected boolean needHomework(){return false;}

    final void postSource(){
        System.out.println("提交源代码");
    }

    final void postNote(){
        System.out.println("提交笔记");
    }

    final void liveVideo(){
        System.out.println("直播授课");
    }

    final void creatPPT(){
        System.out.println("准备上课ppt");
    }

    final void postPreResource(){
        System.out.println("分发预习资料");
    }

}
