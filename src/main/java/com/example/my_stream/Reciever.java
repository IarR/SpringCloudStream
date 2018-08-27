package com.example.my_stream;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Reciever {

    @StreamListener(IStream.INPUT)
    public void getMessage(@Payload String msg){
        System.out.println(msg);
    }

}
