package com.web.api.repository;

import com.web.api.model.Configs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigsRepository extends JpaRepository<Configs, Integer> {
}
