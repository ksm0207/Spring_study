package myfirst_spring.study_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ByeController {
    @GetMapping("bye")
    public String bye (Model model){
        model.addAttribute("b_data","안녕히가세요.");
        if (model == null) {
            System.out.print("True");
        }else{
            System.out.print("False");
        }

        return "bye";
    }



}
