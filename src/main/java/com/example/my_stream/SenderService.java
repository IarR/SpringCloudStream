package com.example.my_stream;

import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

    private final IStream iStream;

    public SenderService(IStream iStream) {
        this.iStream = iStream;
    }

    public void sendMessage(String greeting){
        iStream.sendMessage().send(MessageBuilder.withPayload(greeting).build());
    }
}
