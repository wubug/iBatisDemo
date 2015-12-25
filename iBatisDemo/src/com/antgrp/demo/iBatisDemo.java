package com.antgrp.demo;

import java.sql.Date;
import java.util.List;

import com.antgrp.daoimpl.UserDaoImpl;
import com.antgrp.entity.User;

public class iBatisDemo {
    public static void main(String[] args) {
        UserDaoImpl UserDaoImpl=new UserDaoImpl();
        
        //测试插入
        User addUser=new User();
        addUser.setName("李四");
        addUser.setBirth(Date.valueOf("2011-09-02"));
        addUser.setScore(88);
        addUser.setEmail("qxwu@126.com");
        System.out.println(UserDaoImpl.addUser(addUser));        
                
        addUser.setName("李五");
        addUser.setBirth(Date.valueOf("1990-09-02"));
        addUser.setScore(98);
        addUser.setEmail("wubug@hotmail.com");
        System.out.println(UserDaoImpl.addUser(addUser));
        //根据Id查询
        //System.out.println(UserDaoImpl.selectUserById(2));
        /*
        //根据姓名查询
        List<User> list=UserDaoImpl.selectUserByName("李");
        for(User User:list){
            System.out.println(User);
        }*/
       
        //查询所有
        
        List<User> list=UserDaoImpl.selectAllUser();
        for(User User:list){
            System.out.println(User);
        }
        
        //更新信息
        /*
        User updateUser=new User();
        updateUser.setId(1);
        updateUser.setName("李四1+");
        updateUser.setBirth(Date.valueOf("1990-09-07"));
        updateUser.setScore(24);
        System.out.println(UserDaoImpl.updateUser(updateUser));
        */
        /*
        //删除数据
        Boolean b=UserDaoImpl.deleteUserById(1);
        System.out.println("删除结果:"+b);
        */
    }    
}