package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private Integer empId;
	private String empGender;
	private String empCountry;
	private String empName;
	private double empSalary;
	
	
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}
	public void setEmpname(String empname) {
		this.empName = empname;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empGender=" + empGender + ", empCountry=" + empCountry + ", empname="
				+ empName + ", empSalary=" + empSalary + "]";
	}
	
	
	
}
