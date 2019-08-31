package com.gupaoedu.vip.pattern.observer.event;

import com.gupaoedu.vip.pattern.observer.event.mouseevent.Mouse;
import com.gupaoedu.vip.pattern.observer.event.mouseevent.MouseEventCallback;
import com.gupaoedu.vip.pattern.observer.event.mouseevent.MouseEventType;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class MouseEventTest {

    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        //@谁？   @回调方法
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        mouse.click();

        mouse.focus();

    }
}
