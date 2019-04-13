package demo.project;

import junit.framework.TestCase;

public class TestJunit extends TestCase {

	public TestJunit(String name) {
		super(name);
		
		System.out.println("Tearing down the test caseses");
	}

}
