package com.mw.controller;

import com.mw.entity.BlogEntity;
import com.mw.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mike.wang on 2017/7/19.
 */
@Controller
public class AnswerController {

    @Autowired
    BlogRepository blogRepository;
    @RequestMapping(value = "/answer",method = RequestMethod.POST)
    public String GetAnswer(@ModelAttribute("blogentity") BlogEntity blogEntity){
        blogRepository.saveAndFlush(blogEntity);
        return "SearchResults";
    }
}
