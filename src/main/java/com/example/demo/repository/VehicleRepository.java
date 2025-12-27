
package com.example.demo.repository;
public interface VehicleRepository {
    Vehicle save(Vehicle v);
    Optional<Vehicle> findById(Long id);
    Optional<Vehicle> findByVehicleNumber(String num);
    List<Vehicle> findByUserId(Long userId);
}
