package com.enigma.dev.controller;

import com.enigma.dev.model.User;
import com.enigma.dev.sevice.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @PostMapping("/saveUserInfo")
    public RedirectView saveUserInfo(@ModelAttribute User user, RedirectAttributes redirectAttributes ) {
        LOGGER.info("HomeController :: saveUserInfo :: user :: " + user.toString());
        userService.saveUserInfo(user);
        redirectAttributes.addFlashAttribute("message","you have signed up successfully.please login");
        return new RedirectView("/");
    }
}
