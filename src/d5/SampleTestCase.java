package d5;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SampleTestCase {

	@Test
	void testOne() {
		Sample sample = new Sample();
		boolean result = sample.minus(5, 9);
		
		Assert.assertTrue(result);
	}
}
