package basic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class J004_AnnotationDemo {
	
	@Test
	public void alpha()
	{
		System.out.println("running alpha test");
	}
	
	@Test
	public void beta()
	{
		System.out.println("running beta test");
	}
	
	@Test
	public void gama()
	{
		System.out.println("running gama test");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("running before every test");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("running after every test");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("runnig before all test");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("runnoing after all test");
	}
	
	
}
