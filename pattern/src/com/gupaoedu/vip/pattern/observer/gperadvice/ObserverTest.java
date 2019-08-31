package com.gupaoedu.vip.pattern.observer.gperadvice;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class ObserverTest {

    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher james = new Teacher("詹姆士");
        Teacher kobe = new Teacher("科比");

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式有哪些应用场景？");
        gper.addObserver(james);
        gper.addObserver(kobe);
        gper.publishQuestion(question);
    }
}
