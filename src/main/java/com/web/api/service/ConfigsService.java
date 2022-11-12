package com.web.api.service;

import com.web.api.model.Configs;
import com.web.api.repository.ConfigsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class ConfigsService {
    @Autowired
    private ConfigsRepository configsRepository;
    public List<Configs> getConfigs() {
        return configsRepository.findAll();
    }
}
