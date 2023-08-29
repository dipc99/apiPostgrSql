package com.example.api.service;

import com.example.api.entity.PresidentProfile;

import java.util.Optional;

public interface PresidentService {

    PresidentProfile createProfile(PresidentProfile presidentProfile);

    PresidentProfile getProfileById(Long presidentId);

    void deleteProfile(Long presidentId);
}
