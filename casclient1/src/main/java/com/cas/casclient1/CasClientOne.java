package com.cas.casclient1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;

//@RestController注解，相当于@Controller+@ResponseBody两个注解的结合，
//但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面。
//@RestController
@Controller
@EnableAutoConfiguration
public class CasClientOne {

    @RequestMapping("/CasClientOne")
//    @ResponseBody
    public String CasClientOne(HttpSession session, HttpServletRequest request){

        Principal userPrincipal = request.getUserPrincipal();

        String name = userPrincipal.getName();

        session.setAttribute("msg",name+"登录了CasClientOne。。。");
        return "CasClientOne";
    }


    /*@RequestMapping("/LogoutOne")
    public String logout(HttpSession session){
        session.invalidate();
        String url = "http://localhost:8091/cas/logout";
        return "redirect"+url;
    }*/

}
