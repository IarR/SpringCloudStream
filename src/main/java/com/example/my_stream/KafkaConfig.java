package com.example.my_stream;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(IStream.class)
public class KafkaConfig {
}
