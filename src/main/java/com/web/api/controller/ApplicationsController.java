package com.web.api.controller;

import com.web.api.model.Applications;
import com.web.api.service.ApplicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
public class ApplicationsController {

    @Autowired
    ApplicationsService applicationsService;

    @GetMapping("/getApplications")
    public List<Applications> list() {
        return applicationsService.getApplications();
        
    }
}
