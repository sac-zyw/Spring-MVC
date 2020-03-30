package com.sac.controller;

import com.sac.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ShiAC
 * @date 2020/3/30
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/t1")
    public String test1(String name,Model model){
        //1.接收前端参数
        System.out.println("接收到前端参数为"+name);
        //2.将返回的结果传递给前端
        model.addAttribute("msg",name);
        //3.跳转视图
        return "test";
    }

    //前端接收的是一个对象,匹配user对象中的字段名，如果名字一致则ok，否则，无法匹配到
    @RequestMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }

    @RequestMapping("/t3")
    public String test3(ModelMap map){

        return "test";
    }
}
