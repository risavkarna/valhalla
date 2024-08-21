package dev.risav.valhalla.appointment;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppointmentRepository extends JpaRepository<Appointment, UUID> {
}
