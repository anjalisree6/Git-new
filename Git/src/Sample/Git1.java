package Sample;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Git1 {

	@Test
	public void test()
	{
		System.out.println("hello");
		
	}
	@BeforeTest
	public void end()
	{
		System.out.println("hello");
	}
	
}
