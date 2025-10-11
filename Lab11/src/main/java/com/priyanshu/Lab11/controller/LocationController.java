package com.priyanshu.Lab11.controller;
import com.priyanshu.Lab11.entity.Location;
import com.priyanshu.Lab11.service.LocationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/locations")
public class LocationController {
    private final LocationService locationService;
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }
    @PostMapping
    public Location addLocation(@RequestBody Location location) {
        return locationService.addLocation(location);
    }
    @GetMapping
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }
    @GetMapping("/{id}")
    public Location getLocationById(@PathVariable int id) {
        return locationService.getLocationById(id);
    }
    @PutMapping("/{id}")
    public Location updateLocation(@PathVariable int id, @RequestBody Location location) {
        return locationService.updateLocation(id, location);
    }
    @DeleteMapping("/{id}")
    public String deleteLocation(@PathVariable int id) {
        locationService.deleteLocation(id);
        return "Location deleted successfully!";}}
