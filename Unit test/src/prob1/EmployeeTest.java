package prob1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	@DisplayName("Test Case 1")
	void testGetPay1() {
		Employee e = new Employee ("Rob", 10);
		e.setHours(0, 0);
		e.setHours(1, 0);
		e.setHours(2, 0);
		e.setHours(3, 0);
		e.setHours(4, 0);
		e.setHours(5, 0);
		e.setHours(6, 0);
		
		double expPay = 0.00;
		double accPay = e.getPay();
		assertEquals(expPay, accPay);
	}

	@Test
	@DisplayName("Test Case 3")
	void testGetPay3() {
		Employee e = new Employee ("Rob", 10);
		e.setHours(0, 3);
		e.setHours(1, 4);
		e.setHours(2, 4);
		e.setHours(3, 2);
		e.setHours(4, 0);
		e.setHours(5, 0);
		e.setHours(6, 0);
		
		double expPay = 130.00;
		double accPay = e.getPay();
		assertEquals(expPay, accPay);
	}
	
	@Test
	@DisplayName("Test Case 5")
	void testGetPay5() {
		Employee e = new Employee ("Rob", 10);
		e.setHours(0, 5);
		e.setHours(1, 0);
		e.setHours(2, 2);
		e.setHours(3, 3);
		e.setHours(4, 2);
		e.setHours(5, 2);
		e.setHours(6, 0);
		
		double expPay = 160.00;
		double accPay = e.getPay();
		assertEquals(expPay, accPay);
	}

	@Test
	@DisplayName("Test Case 7")
	void testGetPay7() {
		Employee e = new Employee ("Rob", 10);
		e.setHours(0, 8);
		e.setHours(1, 9);
		e.setHours(2, 7);
		e.setHours(3, 10);
		e.setHours(4, 2);
		e.setHours(5, 0);
		e.setHours(6, 0);
		
		double expPay = 360.00;
		double accPay = e.getPay();
		assertEquals(expPay, accPay);
	}
	
	@Test
	@DisplayName("Test Case 9")
	void testGetPay9() {
		Employee e = new Employee ("Rob", 10);
		e.setHours(0, 10);
		e.setHours(1, 9);
		e.setHours(2, 12);
		e.setHours(3, 10);
		e.setHours(4, 10);
		e.setHours(5, 0);
		e.setHours(6, 0);
		
		double expPay = 565.00;
		double accPay = e.getPay();
		assertEquals(expPay, accPay);
	}
	
	@Test
	@DisplayName("Test Case 11")
	void testGetPay11() {
		Employee e = new Employee ("Rob", 10);
		e.setHours(0, 9);
		e.setHours(1, 11);
		e.setHours(2, 10);
		e.setHours(3, 10);
		e.setHours(4, 12);
		e.setHours(5, 0);
		e.setHours(6, 6);
		
		double expPay = 700.00;
		double accPay = e.getPay();
		assertEquals(expPay, accPay);
	}
	
	@Test
	@DisplayName("Test Case 13")
	void testGetPay13() {
		Employee e = new Employee ("Rob", 10);
		e.setHours(0, 9);
		e.setHours(1, 12);
		e.setHours(2, 10);
		e.setHours(3, 8);
		e.setHours(4, 4);
		e.setHours(5, 7);
		e.setHours(6, 8);
		
		double expPay = 795.00;
		double accPay = e.getPay();
		assertEquals(expPay, accPay);
	}
}
