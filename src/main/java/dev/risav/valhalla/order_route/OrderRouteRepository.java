package dev.risav.valhalla.order_route;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRouteRepository extends JpaRepository<OrderRoute, UUID> {
}
