package in.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository empRepo;
	
	public EmployeeService(EmployeeRepository empRepo)
	{
		this.empRepo = empRepo;
	}
	
	public void getEmps()
	{
		List<Employee> allEmps = empRepo.findAll(Sort.by("empName").ascending());
		
		allEmps.forEach(System.out::println);
	}
}
