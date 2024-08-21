package dev.risav.valhalla.form;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FormRepository extends JpaRepository<Form, UUID> {
}
