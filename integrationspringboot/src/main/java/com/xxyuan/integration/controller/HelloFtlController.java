package com.xxyuan.integration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping(value = "/ftl")
public class HelloFtlController {

    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String, Object> map) {
        map.put("hello", "from TemplateController.helloFtl");
        return "/helloFtl";
    }
}
