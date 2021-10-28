package com.football.housingplatform.controller;

import com.football.housingplatform.dao.domain.User;
import com.football.housingplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "Login";
    }

    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    public ModelAndView Login(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        String name = request.getParameter("name");
        //System.out.println(name);
        String password = request.getParameter("password");
        //System.out.println(password);
        int k = userService.login(name,password);
        modelAndView.addObject("userid",k);
        //System.out.println(k);
        if(k==0 || k==-1){
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.print("<script type='text/javascript'>alert('登陆失败!');</script>");
            modelAndView.setViewName("Login");
        }
        else{
            session.removeAttribute("userId");
            session.setAttribute("userId",k);
            modelAndView.setViewName("redirect:/info/list");
        }
        return modelAndView;
    }

    @RequestMapping("/SignUp")
    public String Signup(User user){
        user.setAuthority(1);
        System.out.println(user);
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
        return "redirect:/info/list";
    }
}
