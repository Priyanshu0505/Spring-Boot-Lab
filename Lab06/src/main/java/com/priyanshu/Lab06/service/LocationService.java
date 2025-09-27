package com.priyanshu.Lab06.service;
import com.priyanshu.Lab06.entity.Location;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class LocationService {
    private final List<Location> locations = new ArrayList<>();
    public LocationService() {
        locations.add(new Location(1, "Country : India", "State : Bihar"));
        locations.add(new Location(2, "Country : India", "State : Haryana"));
        locations.add(new Location(3, "Country : India", "State : Jharkhand"));}
    public List<Location> getAllLocations() {
        return locations;}
    public Optional<Location> getLocationById(int id) {
        return locations.stream().filter(l -> l.getId() == id).findFirst();}}
