package dev.risav.valhalla.location;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<Location, UUID> {
}
