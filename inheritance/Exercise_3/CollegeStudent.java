package inheritance.Exercise_3;

public class CollegeStudent extends Student {
	String collegeName;
	String yearofStudy;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getYearofStudy() {
		return yearofStudy;
	}
	public void setYearofStudy(String yearofStudy) {
		this.yearofStudy = yearofStudy;
	}
	
	public void getCollegeStudentDetails() {
		getStudentDetails();
		System.out.println("College Name: "+collegeName);
		System.out.println("Year of Study: "+yearofStudy);
	}
}
