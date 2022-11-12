package com.web.api.service;

import com.web.api.model.Applications;
import com.web.api.repository.ApplicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class ApplicationsService {
    @Autowired
    private ApplicationsRepository applicationsRepository;
    public List<Applications> getApplications() {
        return applicationsRepository.findAll();
    }

}
