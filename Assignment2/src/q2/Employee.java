package q2;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	
	public Employee() {
	}

	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return empId;
	}

	public void setEmployee(int employee) {
		this.empId = employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return String.format("Emp Id : %-5d Name : %-20s Salary : %-5.2f", this.empId, this.name, this.salary);
	}
	
	
	
}
