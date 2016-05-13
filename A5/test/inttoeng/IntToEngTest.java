package inttoeng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void translate0() {
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String actual = ite.translateEng(0);
		assertThat(actual, is(expected));
	}

	@Test
	public void translate12() {
		IntToEng ite = new IntToEng();
		String expected = "twelve";
		String actual = ite.translateEng(12);
		assertThat(actual, is(expected));
	}

	@Test
	public void translate0to12() {
		IntToEng ite = new IntToEng();
		String[] expected = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve" };
		for (int i = 0; i < expected.length; i++) {
			String actual = ite.translateEng(i);
			assertThat(actual, is(expected[i]));
		}
	}
	@Test
	public void translate13to19() {
		IntToEng ite = new IntToEng();
		String[] expected = { "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		for (int i = 0; i < expected.length; i++) {
			String actual = ite.translateEng(i+13);
			assertThat(actual, is(expected[i]));
		}
	}
}
