package dev.risav.valhalla.obs;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ObsRepository extends JpaRepository<Obs, UUID> {
}
