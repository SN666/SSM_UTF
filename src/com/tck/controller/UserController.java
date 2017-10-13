package com.tck.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.tck.dao.PowerDao;
import com.tck.dao.UserDao;
import com.tck.entity.Power;
import com.tck.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserDao userDao = ctx.getBean(UserDao.class);
    PowerDao powerDao =ctx.getBean(PowerDao.class);
    @RequestMapping("/list")
    public String list(HttpServletRequest request){
    	
        List<User> list = userDao.findAll();
        System.out.println(list.get(0).getUsername());
        request.setAttribute("users", list);
        return "admin/login/list";
    }
    @RequestMapping("/login")
    public String login(HttpServletRequest request){
    	List<Power> powerlist =powerDao.findAll();
    	System.out.println("登录中...");
    	request.setAttribute("power", powerlist);
    	return "admin/main";
    }
    
    @RequestMapping("/add")
    public String add(User user){
        userDao.addUser(user);
        return "admin/login/success";
    }
    
    @RequestMapping("/delete")
    public String delete(String userid){
        userDao.deleteById(userid);
        return "admin/login/success";
    }
    
    @RequestMapping("/get")
    public String get(String userid,HttpServletRequest request) throws IOException{
        User user = userDao.findById(userid);
        request.setAttribute("user", user);
        return "admin/login/show";
    }
    
    @RequestMapping("/update")
    public String update(User user){
        userDao.updateUser(user);
        return "admin/login/success";
    }
    @RequestMapping("/back")
    public String back( ){
        
        return "admin/main";
    }
}
