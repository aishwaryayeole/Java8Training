
public class EmployeeMain {
	
	public static void main(String[] args) {
		/*Constructor Reference*/
		
		//getEmployee method will execute matching constructor
		IEmployee1 employee1= Employee::new;
		Employee emp1= employee1.getEmployee();
		System.out.println(emp1);
				
		IEmployee2 employee2= Employee::new;
		Employee emp2= employee2.getEmployee(4564,"a");
		System.out.println(emp2);		
		
		System.out.println(employee2.getClass().getName());
	}
}
