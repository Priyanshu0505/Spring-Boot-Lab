package com.priyanshu.Lab07.controller;
import com.priyanshu.Lab07.entity.Location;
import com.priyanshu.Lab07.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/locations")
public class LocationController {
    private final LocationService locationService;

    public LocationController(LocationService locationService) { this.locationService = locationService; }

    @GetMapping("/{id}")
    public ResponseEntity<?> getLocationById(@PathVariable int id) {
        System.out.println("LocationController/ Locations / " + id);
        return locationService.getLocationById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Location with id " + id + " not found"));
    }

    @PostMapping
    public ResponseEntity<Location> addLocation(@RequestBody Location location) {
        return ResponseEntity.status(HttpStatus.CREATED).body(locationService.addLocation(location));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateLocation(@PathVariable int id, @RequestBody Location location) {
        return locationService.updateLocation(id, location)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Location with id " + id + " not found"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteLocation(@PathVariable int id) {
        if (locationService.deleteLocation(id)) {
            return ResponseEntity.ok("Location deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Location with id " + id + " not found");
        }
    }
}
