package dev.risav.valhalla.report;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReportRepository extends JpaRepository<Report, UUID> {
}
