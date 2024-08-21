package dev.risav.valhalla.concept_data_type;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConceptDataTypeRepository extends JpaRepository<ConceptDataType, UUID> {
}
