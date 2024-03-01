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
public class Faculty {
    @Id
    @Generated
    public int id;
    public String name;
    public String email;
    public String phone;
    public String address;
    public String designation;
    public String qualification;
    public String experience;
    public String gender;
    public String dob;
    public String role;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "college_id", referencedColumnName = "id")

    private College college;
}
