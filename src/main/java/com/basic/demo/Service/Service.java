package com.basic.demo.Service;

import com.basic.demo.Model.Student;
import com.basic.demo.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Table;
import java.util.Optional;

@org.springframework.stereotype.Service
@Table(name = "student")
public class Service {
    @Autowired
    private Repository repository;

    public Optional<Student> findStudentById(int id) {
        return repository.findById(id);
    }

    public Student saveStudent(Student student) {
        Student student1;
        try {
            student1 = repository.save(student);
        } catch (Exception ex) {
            return null;
        }
        return student1;
    }
}
