package luan.com.niit.springboot10.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class B1Controller {

    @GetMapping("/calculator")
    public String index(Model model) {
        model.addAttribute("sum", "");
        return "index";
    }


    @PostMapping("/calculator")
    public String handleCaculator(Model model, @RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        model.addAttribute("sum", sum);
        return "index";
    }
}
