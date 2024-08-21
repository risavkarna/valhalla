package dev.risav.valhalla.encounter_type;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EncounterTypeRepository extends JpaRepository<EncounterType, UUID> {
}
