import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;
import org.mockito.Mockito;

public class UnitTest {

	/**
	 * Simple junit test for Main class method cutValueAddedTax(double amount)
	 */
	@Test
	public void unitTest() {
		assertEquals(800, Main.cutValueAddedTax(1000));
	}
	
	/**
	 * Test of Main class method todaysWin(Random random,int maxAmount) using mock object.
	 */
	@Test
	public void mockingTest() {
		Random mockRandom = Mockito.mock(Random.class);
		Mockito.when(mockRandom.nextDouble()).thenReturn(0.5);
		assertEquals(500,(int)Main.todaysWin(mockRandom, 1000));
	}

}
