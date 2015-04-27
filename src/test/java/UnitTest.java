import static org.junit.Assert.*;
import org.junit.Test;

public class UnitTest {

	@Test
	public void unitTest() {
		assertEquals(800, Main.cutValueAddedTax(1000));
	}

}
