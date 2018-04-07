package com.tangcheng.web.mvc.tiles.jsp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author tangcheng
 * 2018/04/07
 */
@Controller
public class HomeController {

    @GetMapping("home")
    public ModelAndView home() {
        return new ModelAndView("site.home", "home", "home");
    }

    @GetMapping("basic")
    public String basic() {
        return "layout.basic";
    }

}
