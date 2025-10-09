package com.priyanshu.Lab10.service;
import com.priyanshu.Lab10.entity.Location;
import com.priyanshu.Lab10.repository.LocationRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LocationService {
    private final LocationRepository locationRepository;
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;}
    // Create
    public Location addLocation(Location location) {
        return locationRepository.save(location);}
    // Read all
    public List<Location> getAllLocations() {
        return locationRepository.findAll();}
    // Read by ID
    public Location getLocationById(int id) {
        return locationRepository.findById(id).orElse(null);}
    // Update
    public Location updateLocation(int id, Location location) {
        location.setId(id);
        return locationRepository.save(location);}
    // Delete
    public void deleteLocation(int id) {
        locationRepository.deleteById(id);}}