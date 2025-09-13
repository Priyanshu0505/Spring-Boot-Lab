package com.priyanshu.Lab3.service;
import com.priyanshu.Lab3.model.Location;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class LocationService {
    private final List<Location> locations = new ArrayList<>();
    public LocationService() {
        // Adding some dummy data
        locations.add(new Location(1, "Bihar", "India"));
        locations.add(new Location(2, "Delhi", "India"));}
    public List<Location> getAllLocations() {
        return locations;}
    public Location addLocation(Location location) {
        locations.add(location);
        return location;}
    public Location getLocationById(int id) {
        return locations.stream()
                .filter(l -> l.getId() == id)
                .findFirst()
                .orElse(null);}}
