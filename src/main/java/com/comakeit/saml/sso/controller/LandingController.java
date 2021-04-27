package com.comakeit.saml.sso.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comakeit.saml.sso.auth.CurrentUser;



@Controller
public class LandingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LandingController.class);

    @RequestMapping("/landing")
    public String landing(@CurrentUser User user, Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LOGGER.info("Current auth: {}", authentication==null?"NULL":authentication.getPrincipal());
        model.addAttribute("username", user.getUsername());
        return "landing";
    }
}
