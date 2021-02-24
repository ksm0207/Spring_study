package myfirst_spring.study_spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NumberControllor {
    @GetMapping
    public String number(Model number){
        number.addAttribute("number","150");
        System.out.println(number);
        return "number";

    }
}
