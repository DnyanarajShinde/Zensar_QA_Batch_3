package test;

public class Employees extends Employee {
	double salary;

	public Employees(String name, String address, int emp_no, double salary) {
		super(name, address, emp_no);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary1) {
		this.salary = salary1;
	}

	public void show() {
		System.out.println("Salary: "+salary);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
	}

}
