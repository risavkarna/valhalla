package dev.risav.valhalla.resource;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ResourceRepository extends JpaRepository<Resource, UUID> {
}
