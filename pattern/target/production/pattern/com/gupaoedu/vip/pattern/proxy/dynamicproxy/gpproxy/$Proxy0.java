com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;
import com.gupaoedu.vip.pattern.proxy.Person;
import java.lang.reflect.*;
public class $Proxy0 implements com.gupaoedu.vip.pattern.proxy.dbroute.IOrderService{
GPInvocationHandler h;
public $Proxy0(GPInvocationHandler h) {
this.h = h;}
public int createOrder(com.gupaoedu.vip.pattern.proxy.dbroute.Order order) {
try{
Method m = com.gupaoedu.vip.pattern.proxy.dbroute.IOrderService.class.getMethod("createOrder",new Class[]{com.gupaoedu.vip.pattern.proxy.dbroute.Order.class});
return ((java.lang.Integer)this.h.invoke(this,m,new Object[]{order})).intValue();
}catch(Error _ex){ }catch(Throwable e){
throw new UnderclaredThrowableException(e);
}return 0;}}
