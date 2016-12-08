package com.test.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        return "home";
    }

    @RequestMapping(value = "/loginAction", method = RequestMethod.POST)
    public String loginAction(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
            model.addAttribute("msg", "Login Success");
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Username or Password incorrect");
            return "redirect:/login";
        }
    }
}
