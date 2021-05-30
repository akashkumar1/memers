package com.shayri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    @RequestMapping("/")
    String home() {
        return "Shayriyan is up & running!";
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
