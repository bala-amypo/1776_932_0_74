package com.example.demo.repository;

public interface RouteOptimizationResultRepository {
    RouteOptimizationResult save(RouteOptimizationResult r);
    Optional<RouteOptimizationResult> findById(Long id);
}
