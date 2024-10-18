package net.moview.api.ecommerce.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/login")
public class LoginController {
    
    @GetMapping
    public String mostrarLogin() {
        return "login/login";
    }
}
