package com.wbz;

import cn.wbz.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王炳智 on 2017/8/22.
 */
public class Test1 {
    public static void main(String[] args) {
       // ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean1.xml");
      /*  User user = (User) ctx.getBean("user");
        System.out.println(user);
        user.add();*/
 /*     UserService userService = (UserService) ctx.getBean("userService");
        System.out.println(userService);
        userService.add();*/

    }
    public static void test2(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean2.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");
        System.out.println(bookService);
        bookService.bookservice();

    }

}
