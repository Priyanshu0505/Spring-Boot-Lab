package com.Priyanshu.Lab3.controller;

import com.Priyanshu.Lab3.entity.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LocationController {

    @GetMapping("/locations")
    public List<Location> getLocations() {
        return Arrays.asList(
                new Location("L1", "Delhi"),
                new Location("L2", "Mumbai"),
                new Location("L3", "Chandigarh")
        );
    }
}
