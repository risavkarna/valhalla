package dev.risav.valhalla.budget;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BudgetRepository extends JpaRepository<Budget, UUID> {
}
