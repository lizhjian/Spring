package com.wuxin.annotation.service;

import com.wuxin.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
   // @Qualifier("userJdbcRepository")//指明装载jdbc的bean
    private UserRepository userRepository;//或者这个变量名和bean同名
    private UserRepository userRepository1;//下面这个就完蛋了，区分不出来了
    public  void add(){
        System.out.println("UserService  add..");

        //有两个实现的话  会默认查找比较像的Bean名字
        userRepository.save();
    }
    /*或者*/
/*    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }*/
}
