package com.example.Collegeinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class College {
    @Id
    @GeneratedValue
    private int id;
    private String collegename;
    private String departments;
    private String location;
    private String courses;
    private String phone;
    private String email;
    private String students;
    private String faculties;
    private double fees;
    @OneToMany(mappedBy = "college",cascade= CascadeType.ALL)
    private List<Department> department;
    @OneToMany(mappedBy = "college", cascade= CascadeType.ALL)
    private List<Faculty> faculty;















}
