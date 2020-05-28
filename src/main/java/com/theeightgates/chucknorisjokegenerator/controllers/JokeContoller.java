package com.theeightgates.chucknorisjokegenerator.controllers;


import com.theeightgates.chucknorisjokegenerator.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class JokeContoller {
    private JokeService jokeService;

    @Autowired
    public JokeContoller(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
