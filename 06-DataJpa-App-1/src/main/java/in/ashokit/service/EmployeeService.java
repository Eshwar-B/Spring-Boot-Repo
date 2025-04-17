package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@Service
public class EmployeeService 
{
	
	@Autowired // optional
	private EmployeeRepository empRepo;
	
	public EmployeeService(EmployeeRepository empRepo)
	{
		this.empRepo = empRepo;
	}
	
	
	public void saveEmployee()
	{
		Employee emp = new Employee();
		
		emp.setEmpId(7);
		emp.setEmpName("madhu");
		emp.setEmpCountry("USA");
		emp.setEmpGender("male");
		emp.setEmpSalary(15000.00);
		
		empRepo.save(emp);
		
	}
	
	public void getAllEmployees()
	{
		Iterable<Employee> allEmployees = empRepo.findAll();
		
		allEmployees.forEach(System.out::println);
	}
	
	public void getEmpWithCountry()
	{
		List<Employee> byempCountry = empRepo.findByempCountry("India");
		
		byempCountry.forEach(System.out::println);
	}
	
	public void getEmpWithGender()
	{
		List<Employee> byempGender = empRepo.findByempGender("female");
		
		byempGender.forEach(System.out::println);
	}
	
	public void getAllEmp()
	{
	 List<Object[]> allEmp = empRepo.findSql3();
		
		allEmp.forEach(obj -> {
			System.out.println("name : " + obj[0] + "  gender : " + obj[1] + "   salary : " + obj[2]);
		});
	}
	
	@Transactional
	public void deleteHql()
	{
		int deleteSql = empRepo.deleteSql();
		System.out.println("rows deleted : " + deleteSql);
	}
	
}
