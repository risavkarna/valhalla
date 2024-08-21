package dev.risav.valhalla.field_option;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FieldOptionRepository extends JpaRepository<FieldOption, UUID> {
}
