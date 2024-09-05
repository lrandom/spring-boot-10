package luan.com.niit.springboot10.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(Model model) {
        model.addAttribute("message", "Hello, World! Test");
        model.addAttribute("message2", "Hello, World! Test2");
        return "index";
    }
}
