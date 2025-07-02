package inheritance.Exercise_2;

public class TestEmployee {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("John");
		System.out.println("Person: "+p.getName());
		
		Employee e = new Employee("Wick", 20000, 2005, "123456");
		System.out.println("Employee Name: "+e.getName());
		System.out.println("Employee Salary: "+e.getSalary());
		System.out.println("Employee Year: "+e.getYear());
		System.out.println("Employee Insurance_no: "+e.getInsurance_no());
	}

}
