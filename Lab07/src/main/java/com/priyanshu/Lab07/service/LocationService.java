package com.priyanshu.Lab07.service;
import com.priyanshu.Lab07.entity.Location;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class LocationService {
    private final List<Location> locations = new ArrayList<>();
    public LocationService() {
        locations.add(new Location(1, "Main Gate", "Sector 5, Campus Rd"));
        locations.add(new Location(2, "Library", "Block B, 2nd Floor"));
        locations.add(new Location(3, "Cafeteria", "Ground Floor, North Wing"));}
    public List<Location> getAllLocations() { return locations; }
    public Optional<Location> getLocationById(int id) {
        return locations.stream().filter(l -> l.getId() == id).findFirst();}
    public Location addLocation(Location location) {
        locations.add(location);
        return location;}
    public Optional<Location> updateLocation(int id, Location updatedLocation) {
        return getLocationById(id).map(existing -> {
            existing.setName(updatedLocation.getName());
            existing.setAddress(updatedLocation.getAddress());
            return existing;});}
    public boolean deleteLocation(int id) {
        return locations.removeIf(l -> l.getId() == id);}}