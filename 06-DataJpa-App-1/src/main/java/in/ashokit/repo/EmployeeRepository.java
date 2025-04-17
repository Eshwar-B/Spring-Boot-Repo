package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{
	// select * from employee where emp_country = "India";
	public List<Employee> findByempCountry(String country);
	
	//select * from employee where emp_gender = "male";
	public List<Employee> findByempGender(String gender);
	
	@Query("from Employee")
	public List<Employee> findSql1();
	
	@Query("from Employee where empCountry = 'USA' or empGender = 'female'")
	public List<Employee> findSql2();
	
	@Query("select empName, empGender, empSalary from Employee")
	public List<Object[]> findSql3();
	
	@Modifying
	@Query("delete from Employee where empId = 8")
	public int deleteSql();
}