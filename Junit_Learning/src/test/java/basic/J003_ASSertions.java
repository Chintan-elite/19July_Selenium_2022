package basic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class J003_ASSertions {
	
	@Test
	public void test()
	{
		//assertEquals(10, 20);
		//assertNotEquals(10, 20);
		
		//assertTrue(10<5);
		//assertFalse(true);
		
		//assertNull(null);
		//assertNotNull(50);
		
		int a[] = {10,20,30,40,50};
		int b[] = {10,20,30,40,50,50};
		
		
		//assertArrayEquals(a, b);
		
		
		Integer p = new Integer(10);
		Integer q = new Integer(10);
		
		
		//assertSame(p, q);
		//assertEquals(p, q);
		
		fail();
		
	}
}
