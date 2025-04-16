package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeRepository empRepo = context.getBean(EmployeeRepository.class);
		
		System.out.println(empRepo.getClass().getName());
		
		
// 		Employee emp3 = new Employee(3, "umesh", 50000.69, "male", "India");
// 		Employee emp4 = new Employee(4, "bhaskar", 60000.00, "male", "India");
// 		Employee emp5 = new Employee(5, "samara", 65000.00, "male", "India");
// 		Employee emp6 = new Employee(6, "naveen", 45000.89, "male", "India");
//		
////		
//		Employee emp = new Employee();
//		emp.setEmpId(1);
//		emp.setEmpCountry("India");
//		emp.setEmpGender("male");
//		emp.setEmpSalary(85000.65);
//		emp.setEmpName("Eshwar");
//		
		
// 		List<Employee> empList = Arrays.asList(emp3,emp4,emp5,emp6); 
 		
 		
//		empRepo.saveAll(empList); //upsert method
		
		Optional<Employee> id3 = empRepo.findById(1);
		if(id3.isPresent()) {
			System.out.println(id3.get());
		}
		
		
		System.out.println("******** Operation Completed ***********");
		
	}

}
