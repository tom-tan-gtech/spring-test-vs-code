package com.tomtan.spring_test_vs_code;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringTestVsCodeApplication {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		Student s = (Student) context.getBean("student_bean");
		s.showInfo();

		((ConfigurableApplicationContext) context).close();
	}
}
