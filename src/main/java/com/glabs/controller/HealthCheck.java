package com.glabs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/healthCheck")
    public ResponseEntity<String> getHealthCheck() {
        return new ResponseEntity<String>("Success", HttpStatus.OK);
    }


}
