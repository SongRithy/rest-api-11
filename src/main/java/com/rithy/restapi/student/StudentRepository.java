package com.rithy.restapi.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    static void set(String name, String email, LocalDate dov) {
    }

    // SELECT * FROM student WHERE email = ?
//    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);

//    Optional<Student> addNewStudent(String name, String email, LocalDate dov);
}
