package com.wbz;

import org.springframework.stereotype.Component;

/**
 * Created by 王炳智 on 2017/8/22.
 */
@Component(value = "user")  //bean id = "user" class="/"
public class User {
    public void add(){
        System.out.println("add.....");
    }
}
