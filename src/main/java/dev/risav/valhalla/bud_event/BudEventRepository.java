package dev.risav.valhalla.bud_event;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BudEventRepository extends JpaRepository<BudEvent, UUID> {
}
