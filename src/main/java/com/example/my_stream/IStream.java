package com.example.my_stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface IStream {

    String INPUT = "my_input";
    String OUTPUT = "my_output";

    @Input(INPUT)
    SubscribableChannel getMessage();

    @Output(OUTPUT)
    MessageChannel sendMessage();
}
