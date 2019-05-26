package me.lizhi.repository;

import me.lizhi.domain.AlipayConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface AlipayRepository extends JpaRepository<AlipayConfig,Long> {
}
