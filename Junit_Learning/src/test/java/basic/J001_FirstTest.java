package basic;

import org.junit.Ignore;
import org.junit.Test;

public class J001_FirstTest {
	
	@Test
	public void test()
	{
		System.out.println("running test 1");
	}
	
	@Ignore
	@Test
	public void test2()
	{
		System.out.println("running test 2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("running test 3");
	}
}
