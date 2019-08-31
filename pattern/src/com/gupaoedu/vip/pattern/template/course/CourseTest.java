package com.gupaoedu.vip.pattern.template.course;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class CourseTest {

    public static void main(String[] args) {
        System.out.println("--java架构师课程--");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("--大数据课程--");
        NetworkCourse bigdataCourse = new BigdataCourse(true);
        bigdataCourse.createCourse();
    }

}
