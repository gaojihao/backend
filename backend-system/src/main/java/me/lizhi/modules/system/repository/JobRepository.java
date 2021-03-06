package me.lizhi.modules.system.repository;

import me.lizhi.modules.system.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
*/
public interface JobRepository extends JpaRepository<Job, Long>, JpaSpecificationExecutor {
}