package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class LearntaggingStepDefination {
	
	@Before // this will run befre every scenario
	public void setup() {
	System.out.println("Initial setup steps");
	}
	
	@After // this will run after every scenario 
	public void tearDown() {
		System.out.println("End all opened items ");
	}
	
	@Given("Test for login")
	public void test_for_login() {
	    System.out.println("Test for login  - Ankit");
	}
	
	@Given("Test for logout")
	public void test_for_logout() {
	    System.out.println("Test for logout- Ankit");
	}

	@Given("Test for Add")
	public void test_for_add() {
	    System.out.println("Test for Add- Ankit");
	}
	
	@Given("Test for sub")
	public void test_for_sub() {
		 System.out.println("Test for sub- Ankit");
	}
}