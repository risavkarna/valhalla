package dev.risav.valhalla.order;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, UUID> {
}
