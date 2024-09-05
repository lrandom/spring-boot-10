package luan.com.niit.springboot10.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class B2Controller {
    String[] products;

    @GetMapping("/search")
    public String index(Model model, @RequestParam(value = "keyword", required = false) String keyword) {
        products = new String[]{"iphone", "samsung", "oppo", "xiaomi", "macbook pro", "macbook air"};

        int count = 0;
        String message = "";
        if (keyword != null) {
            /*for (String product : products) {
                if (product.toLowerCase().contains(keyword.toLowerCase())) {
                    count++;
                }
            }*/
            //convert to stream API
            count = (int) Arrays.stream(products).filter(product -> product.toLowerCase().contains(keyword.toLowerCase())).count();


            if (count > 0) {
                message = "Đã tìm thấy sản phẩm";
            } else {
                message = "Không tìm thấy sản phẩm";
            }
        }

        model.addAttribute("message", message);
        return "index";
    }
}
