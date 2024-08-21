package dev.risav.valhalla.concept_name;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConceptNameRepository extends JpaRepository<ConceptName, UUID> {
}
