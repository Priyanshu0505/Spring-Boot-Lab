package com.priyanshu.Lab3.controller;
import com.priyanshu.Lab3.model.Location;
import com.priyanshu.Lab3.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/locations")
public class LocationController {
    @Autowired
    private LocationService locationService;
    @GetMapping
    public List<Location> getLocations() {
        return locationService.getAllLocations();}
    @PostMapping
    public Location createLocation(@RequestBody Location location) {
        return locationService.addLocation(location);}
    @GetMapping("/{id}")
    public Location getLocation(@PathVariable int id) {
        return locationService.getLocationById(id);}}
