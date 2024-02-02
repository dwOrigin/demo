package com.njgd.demo.Service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.njgd.demo.Entity.User;
import com.njgd.demo.Mapper.UserMapper;
import com.njgd.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> listAll() {
//        return userMapper.listAll();
        User test1= new User(1,"1","张三","111",1,1,"111","11");
        User test2= new User(2,"2","李四","111",1,2,"111","11");
        User test3= new User(3,"3","李四","111",1,3,"111","11");
        User test4= new User(4,"4","王五","111",1,4,"111","11");
        User test5= new User(5,"5","陈六","111",1,5,"111","11");
        List<User>result=new ArrayList<>();
        result.add(test1);
        result.add(test2);
        result.add(test3);
        result.add(test4);
        result.add(test5);
        return result;
    }
}
