package me.lizhi.repository;

import me.lizhi.domain.EmailConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 */
public interface EmailRepository extends JpaRepository<EmailConfig,Long> {
}
