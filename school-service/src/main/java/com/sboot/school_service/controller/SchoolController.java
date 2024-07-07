package com.sboot.school_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.school_service.entities.School;
import com.sboot.school_service.service.SchoolService;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping
    public School addSchool(@RequestBody School school) {
        return schoolService.addSchool(school);
    }

    @GetMapping("/{id}")
    public School fetchSchoolById(@PathVariable("id") int id) {
        return schoolService.fetchSchoolById(id);
    }

    @GetMapping
    public List<School> fetchSchools() {
        return schoolService.fetchAllSchools();
    }

    @PutMapping("/{id}")
    public String updateSchool(@PathVariable("id") int id, @RequestBody School school) {
        return schoolService.updateSchool(id, school);
    }

}
