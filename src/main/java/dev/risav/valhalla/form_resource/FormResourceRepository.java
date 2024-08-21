package dev.risav.valhalla.form_resource;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FormResourceRepository extends JpaRepository<FormResource, UUID> {
}
