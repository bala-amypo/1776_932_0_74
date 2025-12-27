package com.example.demo.repository;
import java.util.*;
public interface RouteOptimizationResultRepository {
    RouteOptimizationResult save(RouteOptimizationResult r);
    Optional<RouteOptimizationResult> findById(Long id);
}
