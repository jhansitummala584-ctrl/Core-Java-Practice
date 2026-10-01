package basic;
class Company{
	String companyName;
	String companyLocation;
	public Company(String companyName, String companyLocation) {
		this.companyName = companyName;
		this.companyLocation = companyLocation;
	}
	public void companyDetails() {
		System.out.println("Company Name="+companyName);
		System.out.println("Company Location="+companyLocation);
	}
}
class Employee{
	int empNo;
	String empName;
	double empSalary;
	Company comp;
	public Employee(int empNo, String empName, double empSalary, Company comp) {
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
		this.comp = comp;
	}
	public void employeeDetails() {
		System.out.println("Employee Number="+empNo);
		System.out.println("Employee Name="+empName);
		System.out.println("Employee Salary="+empSalary);
		System.out.println("***Company Details***");
		comp.companyDetails();
	}
}
public class CompanyTest {

	public static void main(String[] args) {
		Company c1=new Company("TCS","Chennai");
		Employee e1=new Employee(20,"Ram",100000,c1);
		e1.employeeDetails();

	}

}
