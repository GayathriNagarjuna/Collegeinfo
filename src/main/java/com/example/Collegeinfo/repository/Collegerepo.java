package com.example.Collegeinfo.repository;

import com.example.Collegeinfo.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Collegerepo extends JpaRepository<College,Integer> {
}
