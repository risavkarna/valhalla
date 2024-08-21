package dev.risav.valhalla.form_submission;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FormSubmissionRepository extends JpaRepository<FormSubmission, UUID> {
}
