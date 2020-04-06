package com.jm.service;

import com.jm.mapper.MyBatisMapper;
import com.jm.pojo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBatisService implements IMyBatisService {

    @Autowired
    private MyBatisMapper myBatisMapper;

    @Override
    public UserEntity getUser(int id) {
        return myBatisMapper.getUser(id);
    }
}
