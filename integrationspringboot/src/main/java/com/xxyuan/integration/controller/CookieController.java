package com.xxyuan.integration.controller;

import com.xxyuan.integration.model.User;
import com.xxyuan.integration.utils.CookieUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/ck")
public class CookieController {
    @ResponseBody
    @RequestMapping(value = "/addCookie", produces = {"application/json;charset=UTF-8"})
    public String responseCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("cookieID", "xiaoyuan");
        response.addCookie(cookie);
        return "responseCookie";
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/checkCookie", produces = {"application/json;charset=UTF-8"})
    public String requestCookie(HttpServletRequest request) {
        String cookieID= CookieUtil.getValue(request,"cookieID");
        return "requestCookie:"+cookieID;
    }

}
