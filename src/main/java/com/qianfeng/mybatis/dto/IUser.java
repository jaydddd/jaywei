package com.qianfeng.mybatis.dto;


import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by admin on 2018/3/19.
 */
public interface IUser {
    /*不需要配置映射文件，实体类和数据库名称一样*/
    @Select("SELECT * FROM users")
    List<UserDto2> getUser();
}
