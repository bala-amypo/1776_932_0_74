package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.entity.Vehicle;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.VehicleService;

public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository repo;
    private final UserRepository userRepo;

    public VehicleServiceImpl(VehicleRepository repo, UserRepository userRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
    }

    @Override
    public Vehicle addVehicle(Long userId, Vehicle v) {
        if (v.getCapacityKg() <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        User user = userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        v.setUser(user);
        return repo.save(v);
    }

    @Override
    public Vehicle findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));
    }

    @Override
    public java.util.List<Vehicle> getVehiclesByUser(Long userId) {
        return repo.findByUserId(userId);
    }
}
