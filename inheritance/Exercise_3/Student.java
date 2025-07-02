package inheritance.Exercise_3;

public class Student extends Person{
	String studentId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public void getStudentDetails() {
		getDetails();
		System.out.println("Student Id: "+studentId);
	}
}
