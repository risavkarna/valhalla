package dev.risav.valhalla.bud_user;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BudUserRepository extends JpaRepository<BudUser, UUID> {
}
