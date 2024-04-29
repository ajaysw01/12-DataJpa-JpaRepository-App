package com.aj.DataJpaJpaRepositoryApp;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.context.ConfigurableApplicationContext;

import com.aj.DataJpaJpaRepositoryApp.entity.Employee;
import com.aj.DataJpaJpaRepositoryApp.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
		SpringApplication.run(Application.class, args);
		
		EmployeeRepository repository =
				ctx.getBean(EmployeeRepository.class);
		
		System.out.println(repository.getClass().getName());

		
		
//		Inserting records
//		Employee emp1 = new Employee(101,"ajay",20000.00,"Male","IT");
//		Employee emp2 = new Employee(102,"akshay",30000.00,"Male","Biology");
//		Employee emp3 = new Employee(103,"guddi",50000.00,"Female","IT");
//		Employee emp4 = new Employee(104,"soniya",50000.00,"Male","Sales");
//		Employee emp5 = new Employee(105,"gopal",200000.00,"Male","Biology");
//
//		
//		repository.saveAll(Arrays.asList(emp1,emp2,emp3,emp4,emp5));
//		
//		System.out.println("Record Saved....");
		
		
//		fetching emp details
//		List<Employee> empList = repository.findAll();
//	
//		empList.forEach(System.out::println);
//		
		
		
		
	}

}
