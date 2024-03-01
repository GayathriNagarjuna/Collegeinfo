package com.example.Collegeinfo.service;

import com.example.Collegeinfo.model.College;
import com.example.Collegeinfo.repository.Collegerepo;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class Collegeservice {
    @Autowired
    private Collegerepo collegerepo;

    public static College getcollegeById(int id) {
        return null;

    }
    public College saveCollege(College college) {
        return collegerepo.save(college);


    }

    public College getCollegeById(int id) {


        return collegerepo.findById(id).get();


    }


    public String deleteCollegeById(int id) {
        collegerepo.deleteById(id);
        return "College deleted";


    }

    public College updateCollege(College college) {
        return collegerepo.save(college);


    }

    public Iterable<College> getAllColleges() {
        return collegerepo.findAll();


    }




}
