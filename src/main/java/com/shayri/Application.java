package com.shayri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SpringBootApplication
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Shayriyan is up & running!";
    }

    @GetMapping("/greeting")
    public ModelAndView greeting() {
        ModelAndView mav = new ModelAndView("greeting");
        return mav;
    }

    public static void main(String[] args) {
        try {
           ConfigurableApplicationContext context =
                    SpringApplication.run(Application.class, args);
        } catch (Exception e) {
            System.out.println("error occured in loading spring boot app : "+ e);
        }
    }

}
