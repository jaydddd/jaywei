package com.qianfeng.mybatis.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 2018/3/19.
 */
public class Role implements Serializable{

     private Integer id;
     private String roleName;









    private UserDto2 userDto2;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }








}
