

public interface ShipmentRepository {
    Shipment save(Shipment s);
    Optional<Shipment> findById(Long id);
    List<Shipment> findByVehicleId(Long vehicleId);
}
