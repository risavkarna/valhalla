package dev.risav.valhalla.provider;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProviderRepository extends JpaRepository<Provider, UUID> {
}
