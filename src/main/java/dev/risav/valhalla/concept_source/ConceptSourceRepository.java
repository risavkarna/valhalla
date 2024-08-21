package dev.risav.valhalla.concept_source;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConceptSourceRepository extends JpaRepository<ConceptSource, UUID> {
}
