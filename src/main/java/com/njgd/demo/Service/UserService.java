package com.njgd.demo.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.njgd.demo.Entity.User;

import java.util.List;

public interface UserService extends IService<User> {
    List<User> listAll();
}
