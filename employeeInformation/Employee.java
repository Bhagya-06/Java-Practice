package employeeInformation;

public class Employee {
	public int EmpNo;
	public String EmpName;
	public String joinDate;
	public char desigCode;
	public String Dept;
	public int Basic;
	public int HRA;
	public int IT;
	
	public Employee(int EmpNo, String EmpName, String joinDate, char desigCode, String Dept, int Basic, int HRA, int IT) {
		this.EmpNo = EmpNo;
		this.EmpName = EmpName;
		this.joinDate = joinDate;
		this.desigCode = desigCode;
		this.Dept = Dept;
		this.Basic = Basic;
		this.HRA = HRA;
		this.IT = IT;
	}
	
	
}
