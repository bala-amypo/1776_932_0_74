
package com.example.demo.repository;
import java.util.*;
public interface LocationRepository {
    Location save(Location l);
    Optional<Location> findById(Long id);
    List<Location> findAll();
}
