package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeService empService = context.getBean(EmployeeService.class);
				
//		empService.getEmps(4);
		
		Employee emp = new Employee();
		
		emp.setEmpGender("female");
		
		empService.getEmpByQBE(emp);
	}

}
