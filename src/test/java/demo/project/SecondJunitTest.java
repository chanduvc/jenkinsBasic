package demo.project;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondJunitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("Execute before running test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Execute after running test");
	}

	@Test
	public void test() {
		
		fail("Test case is not failes");
	}

}
