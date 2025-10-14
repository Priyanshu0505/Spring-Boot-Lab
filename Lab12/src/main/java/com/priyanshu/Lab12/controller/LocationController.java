package com.priyanshu.Lab12.controller;
import com.priyanshu.Lab12.entity.Location;
import com.priyanshu.Lab12.service.LocationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/locations")
public class LocationController {
    private final LocationService locationService;
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }
    // Show all locations
    @GetMapping
    public String getAllLocations(Model model) {
        model.addAttribute("locations", locationService.findAll());
        model.addAttribute("location", new Location());
        return "locations";
    }
    // Add new location
    @PostMapping("/add")
    public String addLocation(@ModelAttribute("location") Location location) {
        locationService.save(location);
        return "redirect:/locations";
    }
    // Delete location
    @GetMapping("/delete/{id}")
    public String deleteLocation(@PathVariable int id) {
        locationService.deleteById(id);
        return "redirect:/locations";
    }
}
