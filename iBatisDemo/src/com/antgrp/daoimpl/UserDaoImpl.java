package com.antgrp.daoimpl;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.antgrp.dao.IUserDao;
import com.antgrp.entity.User;

public class UserDaoImpl implements IUserDao {
    private static SqlMapClient sqlMapClient = null;

    // 读取配置文件
    static {
        try {
            Reader reader = Resources.getResourceAsReader("com/antgrp/entity/SqlMapConfig.xml");
            sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean addUser(User User) {
        Object object = null;
        boolean flag = false;
        try {
            object = sqlMapClient.insert("addUser", User);
            System.out.println("添加学生信息的返回值:" + object);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (object != null) {
            flag = true;
        }
        return flag;
    }

    public boolean deleteUserById(int id) {
        boolean flag = false;
        Object object = null;
        try {
            object = sqlMapClient.delete("deleteUserById", id);
            System.out.println("删除学生信息的返回值:" + object + ",这里返回的是影响的函数");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (object != null) {
            flag = true;
        }
        return flag;
    }

    public boolean updateUser(User User) {
        boolean flag = false;
        Object object = false;
        try {
            object = sqlMapClient.update("updateUser", User);
            System.out.println("更新学生信息的返回值:" + object + ",返回影响的行数");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(object!=null){
            flag=true;
        }
        return flag;
    }

    public List<User> selectAllUser() {
        List<User> Users=null;
        try {
            Users=sqlMapClient.queryForList("selectAllUser");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return Users;
    }

    public List<User> selectUserByName(String name) {
        List<User> Users=null;
        try {
            Users=sqlMapClient.queryForList("selectUserByName", name);
        } catch (SQLException e) {            
            e.printStackTrace();
        }
        return Users;
    }

    public User selectUserById(int id) {
        User User=null;
        try {
            User=(User)sqlMapClient.queryForObject("selectUserById",id);
        } catch (SQLException e) {            
            e.printStackTrace();
        }
        return User;
    }

}
