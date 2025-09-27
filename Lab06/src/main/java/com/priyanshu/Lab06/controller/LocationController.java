package com.priyanshu.Lab06.controller;
import com.priyanshu.Lab06.entity.Location;
import com.priyanshu.Lab06.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/locations")
public class LocationController {
    private final LocationService locationService;
    public LocationController(LocationService locationService) {
        this.locationService = locationService;}
    @GetMapping("/{id}")
    public ResponseEntity<?> getLocationById(@PathVariable int id) {
        System.out.println("LocationController/ Locations / " + id);
        return locationService.getLocationById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Location with id " + id + " not found"));}}
