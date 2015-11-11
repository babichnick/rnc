import org.junit.Assert;
import org.junit.Test;

public class RomanToNumbersTest {

	@Test
	public final void whenaCorrectNumeralUsedThenNoExceptionIsThrown () {
		RomanToNumbers.convertRomanToNumbers("LXI");
		Assert.assertTrue(true);

	}

	@Test
	public final void checkIncorrectNumeral () {
		Assert.assertEquals(0, RomanToNumbers.convertRomanToNumbers("ROXY"));

	}
	
	@Test
	public final void checkAllBasicNumerals() {
		Assert.assertEquals(1000, RomanToNumbers.convertRomanToNumbers("M"));
		Assert.assertEquals(500, RomanToNumbers.convertRomanToNumbers("D"));
		Assert.assertEquals(100,RomanToNumbers.convertRomanToNumbers("C"));
		Assert.assertEquals(50,RomanToNumbers.convertRomanToNumbers("L"));
		Assert.assertEquals(10,RomanToNumbers.convertRomanToNumbers("X"));
		Assert.assertEquals(5,RomanToNumbers.convertRomanToNumbers("V"));
		Assert.assertEquals(1,RomanToNumbers.convertRomanToNumbers("I"));
	}
	
	@Test
	public final void checkMMVItobe2006 () {
		Assert.assertEquals(2006, RomanToNumbers.convertRomanToNumbers("MMVI"));

	}
	
	@Test
	public final void checkCorrent2CharNumeral () {
		Assert.assertEquals(15, RomanToNumbers.convertRomanToNumbers("XV"));

	}
	
	@Test
	public final void checkCorrent3CharNumeral () {
		Assert.assertEquals(61, RomanToNumbers.convertRomanToNumbers("LXI"));

	}
	
	@Test
	public final void checkCorrent4CharNumeral () {
		Assert.assertEquals(96, RomanToNumbers.convertRomanToNumbers("XCVI"));

	}
	
	@Test
	public final void checkCorrent5CharNumeral () {
		Assert.assertEquals(171, RomanToNumbers.convertRomanToNumbers("CLXXI"));

	}

	@Test
	public final void checkSmallValue () {
		Assert.assertEquals(3, RomanToNumbers.convertRomanToNumbers("III"));

	}
	
	@Test
	public final void checkBigValue () {
		Assert.assertEquals(3888, RomanToNumbers.convertRomanToNumbers("MMMDCCCLXXXVIII"));

	}
	
}
