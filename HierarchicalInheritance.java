package New;
class Employee{
	int basicSalary=7500;
}
class Developer extends Employee{
	int projectAllowance=12000;
	public void showDeveloperSalary() {
		System.out.println("Developer Salary = "+(projectAllowance+basicSalary));
	}
}
class Tester extends Employee{
	int testingAllowance=5000;
	public void showTesterSalary() {
		System.out.println("Tester Salary = "+(testingAllowance+basicSalary));
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Developer d=new Developer();
		d.showDeveloperSalary();
		Tester t=new Tester();
		t.showTesterSalary();
		

	}

}
