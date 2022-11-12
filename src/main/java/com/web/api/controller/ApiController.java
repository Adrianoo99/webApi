package com.web.api.controller;

import com.web.api.model.Applications;
import com.web.api.model.Configs;
import com.web.api.service.ApplicationsService;
import com.web.api.service.ConfigsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired

    ApplicationsService applicationsService;
    ConfigsService configsService;

    @GetMapping("/getApplications")
    public List<Applications> list() {
        return applicationsService.getApplications();
        
    }

    @GetMapping("/getConfigs")
    public List<Configs> getConfigs() {
        return configsService.getConfigs();
    }
}
