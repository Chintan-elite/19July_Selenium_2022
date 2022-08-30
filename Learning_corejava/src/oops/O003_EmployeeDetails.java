package oops;

class Employee
{
	int id;
	String name;
	String email;
	
	
	Employee(int id, String name, String email)
	{
		
		this.id = id;
		this.name= name;
		this.email = email;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
	}
	
	
}

public class O003_EmployeeDetails {
	public static void main(String[] args) {
		
		Employee emp = new Employee(10,"Sweta","sweta@gmail.com");
		emp.display();
		
		Employee emp1 = new Employee(11, "Deepak", "deepak@gmail.com");
		emp1.display();
		
	}
}
