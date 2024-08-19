package com.basic.demo.Repository;

import com.basic.demo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student, Integer> {
}
