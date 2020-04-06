package com.jm.mapper;

import com.jm.pojo.UserEntity;
import org.apache.ibatis.annotations.Select;

public interface MyBatisMapper {

    @Select("select * from student where id = #{id}")
    UserEntity getUser(int id);
}
