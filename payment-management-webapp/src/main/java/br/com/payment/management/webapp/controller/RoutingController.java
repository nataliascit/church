package br.com.payment.management.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoutingController {

    @RequestMapping("/login")
    public String login() {
        return "loginView";
    }
}
