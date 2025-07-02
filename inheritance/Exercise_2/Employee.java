package inheritance.Exercise_2;

public class Employee extends Person {
	double salary;
	int year;
	String insurance_no;
	public double getSalary() {
		return salary;
	}
	public int getYear() {
		return year;
	}
	public String getInsurance_no() {
		return insurance_no;
	}
	public Employee(String name, double salary, int year, String insurance_no) {
		this.name = name;
		this.salary = salary;
		this.year = year;
		this.insurance_no = insurance_no;	
	}
}
