package me.lizhi.repository;

import me.lizhi.domain.QiniuConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jie
 * @date 2018-12-31
 */
public interface QiNiuConfigRepository extends JpaRepository<QiniuConfig,Long> {
}
