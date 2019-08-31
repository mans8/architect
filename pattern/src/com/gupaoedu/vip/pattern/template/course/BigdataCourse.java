package com.gupaoedu.vip.pattern.template.course;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class BigdataCourse extends NetworkCourse {

    private boolean needHomeworkFlag = false;

    public BigdataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }

    protected boolean needHomework(){
        return this.needHomeworkFlag;
    }
}
