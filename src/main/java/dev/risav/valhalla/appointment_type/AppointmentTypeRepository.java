package dev.risav.valhalla.appointment_type;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppointmentTypeRepository extends JpaRepository<AppointmentType, UUID> {
}
