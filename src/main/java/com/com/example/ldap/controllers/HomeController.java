package com.com.example.ldap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView home()
    {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "profile", method = RequestMethod.GET)
    public ModelAndView interfaces()
    {
        return new ModelAndView("profile");
    }
}
