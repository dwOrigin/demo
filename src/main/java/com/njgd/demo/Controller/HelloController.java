package com.njgd.demo.Controller;

import com.njgd.demo.Entity.User;
import com.njgd.demo.Service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
@RequestMapping("/user")
public class HelloController {
    @Resource
    private UserService userService;
    @GetMapping("/hello")
    public String hello(){
        return "hello World";
    }
    @GetMapping("/list")
    public List<User> list(){
        return userService.listAll();
    }
    @PostMapping("/save")
    public boolean save(@RequestBody User user){
        return userService.save(user);
    }
    @PostMapping("/mod")
    public boolean update(@RequestBody User user){
        return userService.updateById(user);
    }
    @PostMapping("/saveOrUp")
    public boolean saveOrUp(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }
    @GetMapping("/delete")
    public boolean delete(@RequestParam  Integer id){
        return userService.removeById(id);
    }

}
