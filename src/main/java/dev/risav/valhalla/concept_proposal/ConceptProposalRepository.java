package dev.risav.valhalla.concept_proposal;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConceptProposalRepository extends JpaRepository<ConceptProposal, UUID> {
}
