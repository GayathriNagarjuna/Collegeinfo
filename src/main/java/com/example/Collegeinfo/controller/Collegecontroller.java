package com.example.Collegeinfo.controller;

import com.example.Collegeinfo.model.College;
import com.example.Collegeinfo.service.Collegeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/College")
public class Collegecontroller {
    @Autowired
    private Collegeservice collegeService;

    @PostMapping
    public College saveCollege(@RequestBody College college) {
        return collegeService.saveCollege(college);
    }

    @GetMapping
    public College getCollegeById(@RequestParam int id) {
        return collegeService.getCollegeById(id);
    }

    @DeleteMapping
    public String deleteCollegeById(@RequestParam int id) {
        return collegeService.deleteCollegeById(id);
    }

    @PutMapping
    public College updateCollege(@RequestBody College college) {
        return collegeService.updateCollege(college);
    }

    @GetMapping("/all")
    public ResponseEntity<Iterable<College>> getAllColleges() {
        return new ResponseEntity<>(collegeService.getAllColleges(), HttpStatus.OK);
    }
}
