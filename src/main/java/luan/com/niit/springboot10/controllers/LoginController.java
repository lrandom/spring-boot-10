package luan.com.niit.springboot10.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam(value = "username") String username,
                              @RequestParam(value = "password") String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        //redirect to home page
        return "redirect:/";
    }
}
