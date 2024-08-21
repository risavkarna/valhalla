package dev.risav.valhalla.concept_word;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConceptWordRepository extends JpaRepository<ConceptWord, UUID> {
}
