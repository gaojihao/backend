package me.lizhi.repository;

import me.lizhi.domain.EmailConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jie
 * @date 2018-12-26
 */
public interface EmailRepository extends JpaRepository<EmailConfig,Long> {
}