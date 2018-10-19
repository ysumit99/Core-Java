package Sumit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void Addtest() {
		
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.add(100, 203);
		assertEquals(303, result);
	}

}
