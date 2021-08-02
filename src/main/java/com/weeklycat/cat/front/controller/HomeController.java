package com.weeklycat.cat.front.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/weekly-cat")
    public String weeklycat(){
        return "weekly-cat";
    }
}
