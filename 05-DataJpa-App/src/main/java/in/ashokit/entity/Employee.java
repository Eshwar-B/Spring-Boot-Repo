package in.ashokit.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private Integer empId;
	
	private String empName;
	private Double empSalary;
	private String empGender;
	private String empCountry;
	
	
	public Employee() {
		
	}
	
	
	// initializing data by constructor 
	public Employee(Integer empId, String empName, Double empSalary, String empGender, String empCountry)
	{
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empGender = empGender;
		this.empCountry = empCountry;
	}
	
	// initializing data using setter methods
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}
	
	@Override
	public String toString() {
	    return "Employee [empId=" + empId + ", empName=" + empName +
	           ", empSalary=" + empSalary + ", empGender=" + empGender +
	           ", empCountry=" + empCountry + "]";
	}

	
}
