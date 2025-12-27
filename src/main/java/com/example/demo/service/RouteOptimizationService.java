package com.example.demo.service;

public interface RouteOptimizationService {
    RouteOptimizationResult optimizeRoute(Long shipmentId);
    RouteOptimizationResult getResult(Long id);
}
