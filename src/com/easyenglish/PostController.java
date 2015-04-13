package com.easyenglish;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {

    //主页
    @RequestMapping("index.html")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
        ModelAndView view = new ModelAndView("/WEB-INF/pages/index.jsp");
        return view;
    }
    
    //每课的详情
    @RequestMapping(value="lesson-{level}-{lesson}.html", method=RequestMethod.GET)
    public ModelAndView postDetail(@PathVariable("level") Integer level, @PathVariable("lesson") Integer lesson, HttpServletRequest request, HttpServletResponse response){
        String viewName = "/WEB-INF/pages/" + level + "/" + lesson + ".jsp";
        ModelAndView view = new ModelAndView(viewName);
        return view;
    }
}
