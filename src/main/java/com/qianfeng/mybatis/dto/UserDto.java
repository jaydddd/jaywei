package com.qianfeng.mybatis.dto;

/**
 * Created by admin on 2018/3/19.
 */
public class UserDto {

     private Integer users_id;
     private String users_name;
    private String users_email;
    private String users_pwd;
     private Character users_sex;

    public Integer getUsers_id() {
        return users_id;
    }

    public void setUsers_id(Integer users_id) {
        this.users_id = users_id;
    }

    public String getUsers_name() {
        return users_name;
    }

    public void setUsers_name(String users_name) {
        this.users_name = users_name;
    }

    public String getUsers_email() {
        return users_email;
    }

    public void setUsers_email(String users_email) {
        this.users_email = users_email;
    }

    public String getUsers_pwd() {
        return users_pwd;
    }

    public void setUsers_pwd(String users_pwd) {
        this.users_pwd = users_pwd;
    }

    public Character getUsers_sex() {
        return users_sex;
    }

    public void setUsers_sex(Character users_sex) {
        this.users_sex = users_sex;
    }
}
