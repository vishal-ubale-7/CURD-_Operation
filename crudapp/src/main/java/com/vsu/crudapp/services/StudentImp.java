package com.vsu.crudapp.services;

import com.vsu.crudapp.entity.Student;
import com.vsu.crudapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImp implements StudentService {

    // create student repository reference
    @Autowired
    StudentRepository studentRepository;

    @Override
    public boolean addStudentDetails(Student std) {
        boolean status = false;
        try {


            studentRepository.save(std);
            status = true;
        } catch (Exception e) {
            e.printStackTrace();
             status = false;
        }
        return false;
    }

    @Override
    public List<Student> getAllStdDetails() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStdDetails(long id) {
        Optional<Student> optional = studentRepository.findAllById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public boolean updateStdDetails(long id, float marks)
    {
        Student std = getStdDetails(id);
        if(std != null)
        {
            std.setMarks(marks);
            studentRepository.save(std);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteStdDetails(long id)
    {
        boolean status=false;
        try
        {
          studentRepository.deleteById(id);
          status=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            status=false;
            return status;
        }
        return false;
    }
}
