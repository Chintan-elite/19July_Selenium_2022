package basic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.Calc;

public class J002_CalcTest {
	
	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int  result = c.add(10, 20);
		int expected = 30;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void squareTest()
	{
		Calc  c= new Calc();
		 int actual =  c.square(5);
		 int expected = 25;
		 assertEquals(expected, actual);
	}
}
