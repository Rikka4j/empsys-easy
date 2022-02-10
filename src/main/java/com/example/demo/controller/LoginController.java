package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *
 * </p>
 *
 * @author wpc
 * @since 2021/8/25
 */
@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String login(
            @RequestParam("username") String username ,
            @RequestParam("password") String password,
            Model model,
            HttpSession session){
        //具体的业务
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }
        else{
            //告诉用户，你登录失败
            model.addAttribute("msg","用户名或者密码错误！");
            return "/index";
        }
    }
    @RequestMapping("/user/logout")
    public String logout(HttpSession session,Model model){
        session.removeAttribute("loginUser");
        return "redirect:/index.html";
    }
}
