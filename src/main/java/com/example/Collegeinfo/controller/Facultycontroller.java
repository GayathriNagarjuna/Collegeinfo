package com.example.Collegeinfo.controller;

import com.example.Collegeinfo.model.Faculty;
import com.example.Collegeinfo.service.Facultyservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments/{departmentId}/faculties")

public class Facultycontroller {
    @Autowired
    public Facultyservice Facultyservice;
    @PostMapping("/add")
    public Faculty addFaculty(@RequestBody Faculty faculty) {
        return Facultyservice.addFaculty(faculty);
    }
}