package com.sboot.school_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.school_service.entities.School;
import com.sboot.school_service.repository.SchoolRepository;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public School addSchool(School school) {
        return schoolRepository.save(school);
    }

    public List<School> fetchAllSchools() {
        return schoolRepository.findAll();
    }

    public School fetchSchoolById(int id) {
        return schoolRepository.findById(id).orElse(null);
    }

    public String updateSchool(int id, School school) {
        int i = school.getId();
        // boolean ab = schoolRepository.findById(i);
        // if(schoolRepository.findById(i) != null) {
        //     schoolRepository.save(school);
        //     return "Successfully Updated";
        // }
        // else {
        //     return "Not found Such Id";
        // }
        school.setId(id);
        schoolRepository.save(school);
        return "Updated";

    }
}
