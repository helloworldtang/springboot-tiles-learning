package com.tangcheng.web.mvc.tiles.jsp.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author tangcheng
 * 2018/04/07
 */
@Slf4j
@Controller
public class GreetController {

    @GetMapping("greeting")
    public ModelAndView greeting(@RequestParam(required = false, defaultValue = ",how are you!") String name) {
        log.info("request member,name:{}", name);
        return new ModelAndView("site.greeting", "name", name);
    }

    @GetMapping("greeting/{name}")
    public ModelAndView greetingBy(@PathVariable String name) {
        log.info("path variable,name:{}", name);
        return new ModelAndView("site.greeting", "name", name);
    }


}
