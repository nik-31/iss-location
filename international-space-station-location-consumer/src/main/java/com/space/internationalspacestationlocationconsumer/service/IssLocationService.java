package com.space.internationalspacestationlocationconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class IssLocationService {
    @KafkaListener(topics = "iss-location", groupId = "iss-location-group")
    public void cabLocation(String location){
        System.out.println(location);
    }
}
