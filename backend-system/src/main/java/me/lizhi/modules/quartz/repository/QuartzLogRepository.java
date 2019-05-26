package me.lizhi.modules.quartz.repository;

import me.lizhi.modules.quartz.domain.QuartzLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 */
public interface QuartzLogRepository extends JpaRepository<QuartzLog,Long>, JpaSpecificationExecutor {

}
