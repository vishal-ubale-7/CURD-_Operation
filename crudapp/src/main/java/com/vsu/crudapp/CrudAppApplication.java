package com.vsu.crudapp;

import com.vsu.crudapp.entity.Student;
import com.vsu.crudapp.services.StudentImp;
import com.vsu.crudapp.services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class CrudAppApplication
{

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(CrudAppApplication.class, args);
		StudentService stdService = context.getBean(StudentImp.class);


           //Insert Operations
		Student std = new Student();
		std.setName("Vishal");
		std.setRollno(102);
		std.setMarks(89.5f);
		boolean status =stdService.addStudentDetails(std);

		   // select operations 1

//		 List<Student> stdList = stdService.getAllStdDetails();
//		 for (Student std : stdList)
//		 {
//			 System.out.println("Id "+std.getId());
//			 System.out.println("Name "+std.getName());
//			 System.out.println("Rollno "+std.getRollno());
//			 System.out.println("Marks "+std.getMarks());
//
//			 System.out.println("______________________________");
//		 }

//                //operations-2 FindbyId
//		     Student std = stdService.getStdDetails(2L);
//		        System.out.println("Id "+std.getId());
//                      System.out.println("Name "+std.getName());
//		        System.out.println("Rollno "+std.getRollno());
//			System.out.println("Marks "+std.getMarks());
//		        System.out.println("________________________");

              // Update Operations
//	         boolean status = stdService.updateStdDetails(1L,92);
//			 if(status)
//			 {
//				 System.out.println("Studnet Details Updated");
//			 }
//			 else
//			 {
//				 System.out.println("Due to same error ");
//			 }

		         //  Delete Student use Id
		// boolean status = stdService.deleteStdDetails(2L);
		// if(status)
		// {
		// 	System.out.println("Student Details Updated");
		// }
		// else
		// {
		// 	System.out.println("Student Details is not updated due to same error");
		// }
		}
	}

