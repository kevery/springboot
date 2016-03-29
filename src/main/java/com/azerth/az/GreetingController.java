package com.azerth.az;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hxt on 2016/3/25.
 */
@Controller
public class GreetingController {

    @RequestMapping("/hello")
    public ModelAndView greeting(ModelAndView modelAndView) {
        modelAndView.setViewName("/index.jsp");
        modelAndView.addObject("name", "name");
        return modelAndView;
    }
}
