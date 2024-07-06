package com.sboot.school_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sboot.school_service.entities.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {
    
}
