package com.example.api.controller;

import com.example.api.entity.PresidentProfile;
import com.example.api.service.PresidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PresidentController {
    @Autowired
    private PresidentService presidentService;

    @PostMapping("/presidentProfile")
    public ResponseEntity<PresidentProfile> createProfile(@RequestBody PresidentProfile presidentProfile) {
        PresidentProfile profile = presidentService.createProfile(presidentProfile);
        return new ResponseEntity<>(profile, HttpStatus.CREATED);
    }

    @PostMapping("/presidentProfile/{presidentId}")
    public ResponseEntity<PresidentProfile> getProfile(@PathVariable Long presidentId) {
        PresidentProfile profileById = presidentService.getProfileById(presidentId);
        return new ResponseEntity<>(profileById, HttpStatus.OK);
    }

    @DeleteMapping("/presidentProfile/{presidentId}")
    public ResponseEntity<String> deleteProfile(@PathVariable Long presidentId) {
         presidentService.deleteProfile(presidentId);
        return new ResponseEntity<>("Profile Successfully deleted", HttpStatus.OK);
    }

}