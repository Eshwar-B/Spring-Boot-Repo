package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee {

	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
	private String empCountry;
	private String empGender;
	
	
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empCountry="
				+ empCountry + ", empGender=" + empGender + "]";
	}
	
	
}
