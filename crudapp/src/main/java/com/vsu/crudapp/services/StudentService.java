package com.vsu.crudapp.services;

import com.vsu.crudapp.entity.Student;

import java.util.List;

public interface StudentService
{
    // Add Students
    public boolean addStudentDetails(Student std);
    // Get All Student
    public List<Student> getAllStdDetails();
    // FindBy-ID Student
    public Student getStdDetails(long id);
    //Update with Marks
    public boolean updateStdDetails(long id, float marks);
    // Delete Students Use Id
    public boolean deleteStdDetails(long id);



}
