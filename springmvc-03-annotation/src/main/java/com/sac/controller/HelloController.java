package com.sac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ShiAC
 * @date 2020/3/30
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model){
        //封装数据,向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC");
        return "hello";//会被视图解析器处理
    }

}
