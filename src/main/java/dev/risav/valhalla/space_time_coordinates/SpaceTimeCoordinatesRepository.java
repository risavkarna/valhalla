package dev.risav.valhalla.space_time_coordinates;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpaceTimeCoordinatesRepository extends JpaRepository<SpaceTimeCoordinates, UUID> {
}
