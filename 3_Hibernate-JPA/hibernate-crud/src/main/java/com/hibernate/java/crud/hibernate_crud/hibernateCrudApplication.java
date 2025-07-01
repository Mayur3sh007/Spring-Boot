package com.hibernate.java.crud.hibernate_crud;

import com.hibernate.java.crud.hibernate_crud.dao.StudentDAO;
import com.hibernate.java.crud.hibernate_crud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class hibernateCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(hibernateCrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Mayuresh","Chavan","mayu@deloitte.com");

		//save the student object
		System.out.println("Saving student in DB...");
		studentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved student! Generated ID: " + tempStudent.getId());
	}
}
