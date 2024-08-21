package dev.risav.valhalla.encounter;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EncounterRepository extends JpaRepository<Encounter, UUID> {
}
