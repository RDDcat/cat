package com.weeklycat.cat.front.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("weekly-cat")
    public String weeklycat() {
        return "weekly-cat";
    }

    @GetMapping("weekly-dandy-cat")
    public String weeklydandycat() {
        return "weekly-dandy-cat";
    }

    @GetMapping("weekly-champion-cat")
    public String weeklychampioncat() {
        return "weekly-champion-cat";
    }

    @GetMapping("weekly-draw-cat")
    public String weeklydrawcat() {
        return "weekly-draw-cat";
    }

}