package dev.risav.valhalla.budget_bud_user;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BudgetBudUserRepository extends JpaRepository<BudgetBudUser, UUID> {
}
