package com.mw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mike.wang on 2017/7/19.
 */
@Controller
public class Answer {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String printHello(ModelMap model){
        model.addAttribute("msg","First Spring MVC");
        model.addAttribute("name","mw");
        return "hello";
    }
}
