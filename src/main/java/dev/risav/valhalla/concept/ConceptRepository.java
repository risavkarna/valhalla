package dev.risav.valhalla.concept;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConceptRepository extends JpaRepository<Concept, UUID> {
}
