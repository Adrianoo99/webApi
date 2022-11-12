package com.web.api.controller;

import com.web.api.model.Configs;
import com.web.api.service.ConfigsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
public class ConfigsController {

    @Autowired
    ConfigsService configsService;

    @GetMapping("/getConfigs")
    public List<Configs> getConfigs() {
        return configsService.getConfigs();
    }

    @GetMapping("/getConfigs/{user_id}")
    public ResponseEntity<Configs> get(@PathVariable Integer user_id) {
        try {
            Configs configs = configsService.getUserConfigs(user_id);
            return new ResponseEntity<Configs>(configs, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Configs>(HttpStatus.NOT_FOUND);
        }
    }
}
