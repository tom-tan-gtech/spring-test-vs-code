package com.tomtan.spring_test_vs_code;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringTestVsCodeApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Student s = (Student) context.getBean("student_bean");
		System.out.println(s.getStudentName());

		((ConfigurableApplicationContext) context).close();
	}
}
