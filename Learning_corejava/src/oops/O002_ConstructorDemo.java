package oops;

class Student
{
//	int id;
//	String name;
	
	Student()
	{
		System.out.println("constructor calling....");
	}
	
	Student(int i)
	{
		System.out.println(i);
	}
	
	Student(String name)
	{
		System.out.println(name);
	}
}

public class O002_ConstructorDemo {
	public static void main(String[] args) {
		
		
		Student st = new Student();
		Student st1 = new Student(10);
		Student st2 = new Student("tops");
		
		
		
	}
}