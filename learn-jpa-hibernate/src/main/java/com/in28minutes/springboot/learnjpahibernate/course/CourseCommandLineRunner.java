package com.in28minutes.springboot.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.in28minutes.springboot.learnjpahibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpahibernate.course.jpa.CourseJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository JDBCrepository ;  // persistance avec JDBC

	@Autowired
	private CourseJpaRepository repository ;   // persistance avec jpa
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1 , "Learn AWS NOW JPA", "in28minutes"));
		repository.insert(new Course(2 , "Learn Azure Now JPA", "in28minutes"));
		repository.insert(new Course(3 , "Learn DevOps Now! JPA", "in28minutes"));
		
		repository.deleteById(1);
		System.out.println(repository.findById(3));
		
		
		
	//	JDBCrepository.insert(new Course(4 , "Learn AWS NOW JDBC", "in28minutes"));
	//	JDBCrepository.insert(new Course(5 , "Learn Azure Now JDBC", "in28minutes"));
	//	JDBCrepository.insert(new Course(6 , "Learn DevOps Now! JDBC", "in28minutes"));
		
	//	JDBCrepository.deleteById(4);
	//	System.out.println(JDBCrepository.findById(6));
		
	}

}
