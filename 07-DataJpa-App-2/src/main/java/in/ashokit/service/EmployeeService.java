package in.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private int pageSize = 4;
	
	private EmployeeRepository empRepo;
	
	public EmployeeService(EmployeeRepository empRepo)
	{
		this.empRepo = empRepo;
	}
	
	public void getEmps(int pageNum)
	{
		 PageRequest page = PageRequest.of(pageNum - 1, pageSize);
		 
		 Page<Employee> all = empRepo.findAll(page);
		 
		 all.forEach(System.out::println);
	}
	
	public void getEmpByQBE(Employee emp)
	{
		Example<Employee> exEmp = Example.of(emp);
		
		List<Employee> filteredEmps = empRepo.findAll(exEmp);
		
		filteredEmps.forEach(System.out::println);
	}
}
