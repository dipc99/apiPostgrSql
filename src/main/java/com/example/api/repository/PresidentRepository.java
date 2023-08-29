package com.example.api.repository;

import com.example.api.entity.PresidentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresidentRepository extends JpaRepository<PresidentProfile,Long> {
}
