package dev.risav.valhalla.form_encounter;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FormEncounterRepository extends JpaRepository<FormEncounter, UUID> {
}
