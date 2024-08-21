package dev.risav.valhalla.patient;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient, UUID> {
}
