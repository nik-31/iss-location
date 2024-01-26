package com.space.internationalspacestationlocationprovider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

import static com.space.internationalspacestationlocationprovider.constants.AppConstant.ISS_LOCATION;

public class KafkaConfig {
    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(ISS_LOCATION)
                .build();
    }
}
