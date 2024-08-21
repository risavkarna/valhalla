package dev.risav.valhalla.budget_service;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BudgetServiceRepository extends JpaRepository<BudgetService, UUID> {
}
