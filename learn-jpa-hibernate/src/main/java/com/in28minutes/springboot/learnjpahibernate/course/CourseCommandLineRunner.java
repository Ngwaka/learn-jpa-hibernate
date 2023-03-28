package com.in28minutes.springboot.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.in28minutes.springboot.learnjpahibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpahibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseSpringDataJpaRepository repository ;

//	@Autowired
//	private CourseJpaRepository jpaRepository ;   // persistance avec jpa
	
	
//	@Autowired
//	private CourseJdbcRepository jdbcRepository ;  // persistance avec JDBC

	
	@Override
	public void run(String... args) throws Exception {
		
		
		repository.save(new Course(1 , "Learn AWS NOW springDataJpa", "in28minutes"));
		repository.save(new Course(2 , "Learn Azure Now springDataJpa", "in28minutes"));
		repository.save(new Course(3 , "Learn DevOps Now! springDataJpa", "in28minutes"));
		repository.deleteById(1l);
		System.out.println(repository.findById(3l));
	
		
		
	
	//	jpaRepository.insert(new Course(1 , "Learn AWS NOW JPA", "in28minutes"));
	//	jpaRepository.insert(new Course(2 , "Learn Azure Now JPA", "in28minutes"));
	//	jpaRepository.insert(new Course(3 , "Learn DevOps Now! JPA", "in28minutes"));
	//	jpaRepository.deleteById(1);
	//	System.out.println(jpaRepository.findById(3));
		
		

		
	//	jdbcRepository.insert(new Course(4 , "Learn AWS NOW JDBC", "in28minutes"));
	//	jdbcRepository.insert(new Course(5 , "Learn Azure Now JDBC", "in28minutes"));
	//	jdbcRepository.insert(new Course(6 , "Learn DevOps Now! JDBC", "in28minutes"));
	//	jdbcRepository.deleteById(4);
	//	System.out.println(jdbcRepository.findById(6));
		
	}

}
