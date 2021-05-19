package com.example.courseData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan({"com.example.courseData"})
@SpringBootApplication
public class CourseDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseDataApplication.class, args);
	}

}
