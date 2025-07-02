package inheritance.Exercise_3;

public class Teacher extends Person {
	double salary;
	String subject;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void getTeacherDetails() {
		getDetails();
		System.out.println("Salary: "+salary);
		System.out.println("Subject: "+subject);
	}
}
