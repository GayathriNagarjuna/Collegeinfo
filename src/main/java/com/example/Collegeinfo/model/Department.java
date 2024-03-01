package com.example.Collegeinfo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue
    private Long departmentId;
    private String departmentName;
    private String departmentCode;
    private String departmentfees;
    private String sections;
    private String students;
    private String faculties;
    private String courses;
    private String Subjects;
    private String Hod;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="college_id",referencedColumnName="id")

    private College college;



}
