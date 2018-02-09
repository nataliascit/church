package br.com.payment.management.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller responsible for setting up the templates routing.
 *
 * @author wcustodio
 */
@Controller
public class RoutingController {

    @RequestMapping("/login")
    public String login() {
        return "loginView";
    }
}
