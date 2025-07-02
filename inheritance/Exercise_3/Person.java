package inheritance.Exercise_3;

public class Person {
	String name;
	String dateofBirth;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public void getDetails() {
		System.out.println("Name: "+name);
		System.out.println("DOB: "+dateofBirth);
	}
}
