

public interface VehicleService {
    Vehicle addVehicle(Long userId, Vehicle v);
    Vehicle findById(Long id);
    java.util.List<Vehicle> getVehiclesByUser(Long userId);
}
