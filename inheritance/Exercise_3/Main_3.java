package inheritance.Exercise_3;

public class Main_3 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("John");
		p.setDateofBirth("06/03/2005");
		
		Teacher t = new Teacher();
		t.setName("Wick");
		t.setDateofBirth("13/09/1980");
		t.setSalary(20000);
		t.setSubject("English");
		
		Student s = new Student();
		s.setName("James");
		s.setDateofBirth("05/05/2009");
		s.setStudentId("123");

		CollegeStudent c = new CollegeStudent();
		c.setName("Bond");
		c.setDateofBirth("13/10/2004");
		c.setStudentId("023");
		c.setCollegeName("Vel Tech High Tech");
		c.setYearofStudy("Fourth");
		
		System.out.println("------- Person Details: -------");
		p.getDetails();
		System.out.println("------- Teacher Details: -------");
		t.getTeacherDetails();
		System.out.println("------- Student Details: -------");
		s.getStudentDetails();
		System.out.println("------- College Student Details: -------");
		c.getCollegeStudentDetails();
	}

}
