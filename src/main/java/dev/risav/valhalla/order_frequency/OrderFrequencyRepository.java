package dev.risav.valhalla.order_frequency;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderFrequencyRepository extends JpaRepository<OrderFrequency, UUID> {
}
