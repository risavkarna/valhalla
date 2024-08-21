package dev.risav.valhalla.concept_map;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConceptMapRepository extends JpaRepository<ConceptMap, UUID> {
}
