package dev.risav.valhalla.service;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServiceRepository extends JpaRepository<Service, UUID> {
}
