package dev.risav.valhalla.budget_entry;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BudgetEntryRepository extends JpaRepository<BudgetEntry, UUID> {
}
