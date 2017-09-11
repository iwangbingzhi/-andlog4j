package com.wbz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 王炳智 on 2017/8/22.
 */
@Service("userService")
public class UserService {
    @Autowired
    private UserDao userDao;
    public void add(){
        System.out.println("service.........");
        userDao.add();
    }
}
