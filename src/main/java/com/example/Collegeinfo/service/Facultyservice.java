package com.example.Collegeinfo.service;

import com.example.Collegeinfo.model.Faculty;
import com.example.Collegeinfo.repository.facultyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Facultyservice {
    @Autowired
    private static facultyrepo repo;


    public Faculty addFaculty(Faculty faculty) {
        return repo.save(faculty);
    }


}


