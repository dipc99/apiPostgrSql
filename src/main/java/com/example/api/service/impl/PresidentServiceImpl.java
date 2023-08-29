package com.example.api.service.impl;

import com.example.api.entity.PresidentProfile;
import com.example.api.repository.PresidentRepository;
import com.example.api.service.PresidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PresidentServiceImpl implements PresidentService {
    @Autowired
    private PresidentRepository presidentRepository;

    @Override
    public PresidentProfile createProfile(PresidentProfile presidentProfile) {
        PresidentProfile presidentProfile1 = presidentRepository.save(presidentProfile);
        return presidentProfile1;
    }

    @Override
    public PresidentProfile getProfileById(Long presidentId) {
        PresidentProfile getPresidentProfile = presidentRepository.findById(presidentId).get();
        return getPresidentProfile;
    }

    @Override
    public void deleteProfile(Long presidentId) {
        PresidentProfile byId = presidentRepository.findById(presidentId).get();
        presidentRepository.deleteById(presidentId);
    }
}
