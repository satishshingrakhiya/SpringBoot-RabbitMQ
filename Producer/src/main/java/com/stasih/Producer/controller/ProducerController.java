package com.stasih.Producer.controller;

import com.stasih.Producer.model.User;
import com.stasih.Producer.service.RabbitMqSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProducerController {

    @Autowired
    private RabbitMqSender sender;

    @Value("${app.message}")
    private String message;

    @PostMapping("/user")
    public String publishUserDetails(@RequestBody User user){
        sender.send(user);
        return message;
    }
}
