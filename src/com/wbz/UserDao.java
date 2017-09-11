package com.wbz;

import org.springframework.stereotype.Component;

/**
 * Created by 王炳智 on 2017/8/22.
 */
@Component("userDao")
public class UserDao {
    public void add(){
        System.out.println("userdao.......");
    }
}
