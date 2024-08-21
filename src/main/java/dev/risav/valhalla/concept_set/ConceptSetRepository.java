package dev.risav.valhalla.concept_set;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConceptSetRepository extends JpaRepository<ConceptSet, UUID> {
}
