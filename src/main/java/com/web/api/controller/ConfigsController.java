package com.web.api.controller;

import com.web.api.model.Configs;
import com.web.api.service.ConfigsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ConfigsController {

    @Autowired
    ConfigsService configsService;

    @GetMapping("/getConfigs")
    public List<Configs> getConfigs() {
        return configsService.getConfigs();
    }
}
