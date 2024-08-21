package dev.risav.valhalla.principal;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PrincipalRepository extends JpaRepository<Principal, UUID> {
}
