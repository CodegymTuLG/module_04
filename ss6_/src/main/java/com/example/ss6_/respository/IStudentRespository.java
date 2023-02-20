package com.example.ss6_.respository;

import com.example.ss6_.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IStudentRespository extends JpaRepository<Student, Integer> {
    @Query(value = "select * from student",nativeQuery = true)
    List<Student> getAll();

}
