
public class Employee {
	private int empId;
	private String name;
	
	public Employee() {
		empId=1110;
		name="Amy";
	};
	
	public Employee(int empId, String name ) {
		this.empId=empId;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	};
	
	
	

}
