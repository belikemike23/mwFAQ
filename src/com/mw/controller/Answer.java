package com.mw.controller;

import com.mw.model.QuestionEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mike.wang on 2017/7/19.
 */
@Controller
public class Answer {
    @RequestMapping(value = "/answer",method = RequestMethod.POST)
    public String GetAnswer(@ModelAttribute("questionentity") QuestionEntity questionEntity){
        return "SearchResults";
    }
}
