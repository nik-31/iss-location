package com.space.internationalspacestationlocationprovider.controller;

import com.space.internationalspacestationlocationprovider.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    LocationService locationService;

    @PutMapping
    public ResponseEntity currentLocation(@RequestParam Integer time){
        while(time >= 0) {
            locationService.location();
            time--;
        }
        return new ResponseEntity(Map.of("message", "location updated"), HttpStatus.OK);
    }
}
