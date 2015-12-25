package com.antgrp.dao;

import java.util.List;

import com.antgrp.entity.User;

public interface IUserDao {
    /*
     * 添加学生信息
     */
    public boolean addUser(User User);
    /*
     * 根据id删除学生信息
     */
    public boolean deleteUserById(int id);
    /*
     * 更新学生信息
     */
    public boolean updateUser(User User);
    /*
     * 查询全部学生信息
     */
    public List<User> selectAllUser();
    
    /*
     * 根据学生姓名模糊查询学生信息
     */
    public List<User> selectUserByName(String name);
    /*
     * 根据学生id查询学生信息
     */
    public User selectUserById(int id);
    
}