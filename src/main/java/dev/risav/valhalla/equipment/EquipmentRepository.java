package dev.risav.valhalla.equipment;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EquipmentRepository extends JpaRepository<Equipment, UUID> {
}
