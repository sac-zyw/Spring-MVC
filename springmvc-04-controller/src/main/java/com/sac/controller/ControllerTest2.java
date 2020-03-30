package com.sac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ShiAC
 * @date 2020/3/30
 */
//这个类会被spring接管，被注解的类如果返回是String，并且有具体页面可以跳转，那么就会被视图解析器解析
@Controller
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test";
    }
}
