package com.example.demo.repository;

import com.example.demo.entity.Location;
import java.util.List;
import java.util.Optional;

public interface LocationRepository {

    Location save(Location location);

    Optional<Location> findById(Long id);

    List<Location> findAll();
}
