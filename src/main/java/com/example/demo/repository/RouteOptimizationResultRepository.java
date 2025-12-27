

public interface RouteOptimizationResultRepository {
    RouteOptimizationResult save(RouteOptimizationResult r);
    Optional<RouteOptimizationResult> findById(Long id);
}
