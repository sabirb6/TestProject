import static org.junit.Assert.*;


import org.junit.*;

public class MyClassTest
{
	//MyClassTest mytest=new MyClassTest();
	@Test
	public void testMultiply() 
	{
			
		
		assertEquals("10 x 0 must be 0", 0, MyClass.multiply(10, 0));
        assertEquals("0 x 10 must be 0", 0,  MyClass.multiply(0, 10));
        assertEquals("0 x 0 must be 0", 0,  MyClass.multiply(0, 0));
	}
	
	@Test
	public void testDivide()
	{
		MyClass tester=new MyClass();
		//tester.divide(20, 15);
		
		assertEquals("input 2 must be greater than 10",2,tester.divide(20, 10));
		
	}
	
} 
