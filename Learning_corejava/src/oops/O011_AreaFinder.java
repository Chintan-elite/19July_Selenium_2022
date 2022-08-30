package oops;

abstract class Shap
{
	public abstract void getArea();
}

class Circle extends Shap
{

	double PI = 3.14;
	double r;
	
	Circle(double r)
	{
		this.r = r;
	}
	
	
	@Override
	public void getArea() {
		double area = PI *r*r;
		System.out.println("area of circle is : "+area);
	}
	
}

class Triangle extends Shap
{
	double base;
	double height;
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public void getArea() {
		
		double area = 0.5*base*height;
		System.out.println("area of triangle :"+area);
	}
	
}


public class O011_AreaFinder {
	public static void main(String[] args) {
		
		Shap s1 = new Circle(20);
		Shap s2 = new Triangle(10, 20);
		
		s1.getArea();
		s2.getArea();
		
		
		
	}
}
