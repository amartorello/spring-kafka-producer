package com.amartorello.springkafkaproducer;

import com.amartorello.springkafkaproducer.model.EventMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaEventMessageSender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private String kafkaTopic = "SDH_SVIL_EXTT0_EXTRA_ACCOUNT-STATES";

    public void send(String string){
        kafkaTemplate.send(kafkaTopic, string);
        System.out.println("Sent: " + string);
    }

}
