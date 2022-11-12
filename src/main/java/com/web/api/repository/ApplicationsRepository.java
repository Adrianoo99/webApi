package com.web.api.repository;

import com.web.api.model.Applications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationsRepository extends JpaRepository<Applications, Integer> {
}
