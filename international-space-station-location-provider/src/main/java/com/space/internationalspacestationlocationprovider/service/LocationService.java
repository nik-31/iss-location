package com.space.internationalspacestationlocationprovider.service;

import com.space.internationalspacestationlocationprovider.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.space.internationalspacestationlocationprovider.constants.AppConstant.ISS_LOCATION;

@Service
public class LocationService {
    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    private final String url = "http://api.open-notify.org/iss-now.json";

    public boolean location(){
        RestTemplate restTemplate = new RestTemplate();

        Response issLocationJson = restTemplate.getForObject(url, Response.class);
        System.out.println(issLocationJson.getIss_position().getLatitude()+" , "+
                issLocationJson.getIss_position().getLongitude());
        kafkaTemplate.send(ISS_LOCATION, issLocationJson.getIss_position().getLatitude()+" , "+
                issLocationJson.getIss_position().getLongitude());
        return true;
    }
}
