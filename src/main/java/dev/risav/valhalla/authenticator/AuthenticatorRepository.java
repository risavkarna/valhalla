package dev.risav.valhalla.authenticator;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthenticatorRepository extends JpaRepository<Authenticator, Long> {
}
