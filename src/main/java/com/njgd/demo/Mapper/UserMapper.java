package com.njgd.demo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.njgd.demo.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
//    List<User>listAlls(){
//
//    };


    List<User> listAll();
}
