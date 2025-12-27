package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Shipment {
    private Long id;
    private Vehicle vehicle;
    private Location pickupLocation;
    private Location dropLocation;
    private Double weightKg;
    private LocalDate scheduledDate;
}
