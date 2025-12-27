
package com.example.demo.repository;
public interface LocationRepository {
    Location save(Location l);
    Optional<Location> findById(Long id);
    List<Location> findAll();
}
