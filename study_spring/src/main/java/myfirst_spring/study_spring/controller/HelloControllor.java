package myfirst_spring.study_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControllor {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","Hello Spring");
        return "hello";
    }
}
