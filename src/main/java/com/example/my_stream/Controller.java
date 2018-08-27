package com.example.my_stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final SenderService senderService;

    public Controller(SenderService senderService) {
        this.senderService = senderService;
    }

    @GetMapping("/{message}")
    public void greetings(@PathVariable String message){
        senderService.sendMessage(message);
    }
}
