package com.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王炳智 on 2017/8/22.
 */
public class Test {
    public static void main(String[] args) {
    test1();
    }
    public static void test1(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean3.xml");
        Book book = (Book) ctx.getBean("book");
        book.add();

    }
}
