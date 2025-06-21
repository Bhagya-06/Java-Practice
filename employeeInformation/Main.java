package employeeInformation;

public class Main {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[7];
		employees[0] = new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000);
		employees[1] = new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000);
		employees[2] = new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000);
		employees[3] = new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000);
		employees[4] = new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 2000, 20000);
		employees[5] = new Employee(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400);
		employees[6] = new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000);
		
		if (args.length == 0) {
		    System.out.println("Please provide an employee ID as a command-line argument.");
		    return;}

		int id = Integer.parseInt(args[0]);
		
		EmployeeDetails e1 = new EmployeeDetails();
		e1.getdetails(employees, id);
	}

}
