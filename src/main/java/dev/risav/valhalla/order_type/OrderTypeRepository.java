package dev.risav.valhalla.order_type;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderTypeRepository extends JpaRepository<OrderType, UUID> {
}
