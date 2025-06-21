package employeeInformation;

public class EmployeeDetails {
	
	public void getdetails(Employee e[], int id) {
		boolean found = false;
		for(int i=0; i<e.length; i++) {
			if(e[i].EmpNo==id) {
				found = true;
				int DA=0, Salary;
				String Designation="";
				switch(e[i].desigCode) {
					case 'e':
						DA = 20000;
						Designation = "Engineer";
						break;
					case 'c':
						DA = 32000;
						Designation = "Consultant";
						break;
					case 'k':
						DA = 12000;
						Designation = "Clerk";
						break;
					case 'r':
						DA = 15000;
						Designation = "Receptionist";
						break;
					case 'm':
						DA = 40000;
						Designation = "Manager";
						break;
				}
				Salary = e[i].Basic + e[i].HRA + DA - e[i].IT;
				System.out.printf("Emp No: %d\n",e[i].EmpNo);
				System.out.printf("Emp Name: %s\n",e[i].EmpName);
				System.out.printf("Department: %s\n",e[i].Dept);
				System.out.printf("Designation: %s\n",Designation);
				System.out.printf("Salary: %d\n",Salary);
			}
		}
		if(found == false) System.out.println("There is no employee with empid : "+id);
	}
}
