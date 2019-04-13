package demo.project;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMainClass {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed test in main class");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear down the applicationin main java class");
	}

	@Test
	public void test() {
		
	}

}
