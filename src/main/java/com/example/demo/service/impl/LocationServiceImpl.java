

package com.example.demo.service.impl;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRepository;
import com.example.demo.service.LocationService;

public class LocationServiceImpl implements LocationService {

    private final LocationRepository repo;

    public LocationServiceImpl(LocationRepository r) {
        this.repo = r;
    }

    @Override
    public Location createLocation(Location l) {
        if (l.getLatitude() < -90 || l.getLatitude() > 90)
            throw new IllegalArgumentException("Invalid latitude");
        return repo.save(l);
    }

    @Override
    public java.util.List<Location> getAllLocations() {
        return repo.findAll();
    }
}
