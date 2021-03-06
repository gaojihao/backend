package me.lizhi.modules.system.repository;

import me.lizhi.modules.system.domain.Dict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
*/
public interface DictRepository extends JpaRepository<Dict, Long>, JpaSpecificationExecutor {
}