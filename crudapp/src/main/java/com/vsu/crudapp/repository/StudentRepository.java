package com.vsu.crudapp.repository;
import com.vsu.crudapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long>
{

    Optional<Student> findAllById(long id);

}
