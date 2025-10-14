package com.priyanshu.Lab12.service;
import com.priyanshu.Lab12.entity.Location;
import com.priyanshu.Lab12.repository.LocationRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class LocationService {
    private final LocationRepository locationRepository;
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }
    public List<Location> findAll() { return locationRepository.findAll(); }
    public void save(Location location) { locationRepository.save(location); }
    public void deleteById(int id) { locationRepository.deleteById(id); }
    public Optional<Location> findById(int id) { return locationRepository.findById(id); }
}
