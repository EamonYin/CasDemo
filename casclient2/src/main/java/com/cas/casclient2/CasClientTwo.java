package com.cas.casclient2;

import com.sun.org.apache.bcel.internal.generic.CASTORE;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
@EnableAutoConfiguration
public class CasClientTwo {

    @RequestMapping("/CasClientTwo")
    public String CasClientTwo(HttpSession session, HttpServletRequest request){

        Principal userPrincipal = request.getUserPrincipal();

        String name = userPrincipal.getName();

        session.setAttribute("msg",name+"登录了CasClientTwo。。。");

        return "CasClientTwo";
    }

    /*@RequestMapping("/LogoutTwo")
    public String logout(HttpSession session){
        session.invalidate();
        String url = "http://localhost:8091/cas/logout";
        return "redirect"+url;
    }*/

}
