package com.football.housingplatform.controller;

import com.football.housingplatform.dao.domain.User;
import com.football.housingplatform.dao.mapper.UserMapper;
import com.football.housingplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "Login";
    }

    @RequestMapping("/Login")
    public ModelAndView Login(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        String name = request.getParameter("name");
//        System.out.println(name);
        String password = request.getParameter("password");
//        System.out.println(password);
        int k = userService.login(name,password);
        modelAndView.addObject("userid",k);
//        System.out.println(k);
        if(k==0){
            modelAndView.setViewName("Login");
        }
        else{

            modelAndView.setViewName("redirect:/myPage/"+k);
        }
        return modelAndView;
    }

    @RequestMapping("/SignUp")
    public String Signup(User user){
        user.setAuthority(1);
        userService.signup(user);
        return "redirect:/login";
    }

    @RequestMapping("/signup")
    public String signup(){
        return "SignUp";
    }


    @RequestMapping("/myPage/{userid}")
    public ModelAndView myPage(@PathVariable("userid") int userid){
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.getInfobyId(userid);
        modelAndView.addObject("user",user);
        modelAndView.setViewName("mypage");
        return modelAndView;
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user){
        int id = user.getId();
        System.out.println(user);
        userService.updateUserById(user);
        return "redirect:/myPage/"+ id;
    }
}
