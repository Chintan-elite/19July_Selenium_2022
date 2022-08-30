package oops;

import modifier.Student;

class Pencil
{
	
	int price=50;
	String color;
	String company;
	
	 public void toWrite()
	 {
		 System.out.println(price+" "+color+" "+company);
	 }
}

class NoteBook extends Pencil
{
	int price = 100;
	public void onwrite()
	{
		System.out.println(super.price+" "+color+" "+company);
	}
}

class Slate extends NoteBook
{
	
}

public class O006_Inheritance {
	public static void main(String[] args) {
		
		Pencil p = new Pencil();
		p.color="black";
		p.company="Natraj";
		
		p.toWrite();
		
		NoteBook b = new NoteBook();
		b.color="white";
		b.company="Classmate";
		b.onwrite();
		
	}
}
