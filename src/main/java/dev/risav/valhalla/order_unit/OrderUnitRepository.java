package dev.risav.valhalla.order_unit;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderUnitRepository extends JpaRepository<OrderUnit, UUID> {
}
