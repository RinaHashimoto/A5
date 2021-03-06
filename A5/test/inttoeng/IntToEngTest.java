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
	@Test
	public void translate20to90() {
		IntToEng ite = new IntToEng();
		int[] numbers = {20,30,40,50,60,70,80,90};
		String[] expected = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		for (int i = 0; i < expected.length; i++) {
			String actual = ite.translateEng(numbers[i]);
			assertThat(actual, is(expected[i]));
		}
	}
	
	@Test
	public void translate21to30() {
		IntToEng ite = new IntToEng();
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) numbers[i] = i+21;
		String[] expected = {"twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight", "twenty nine", "thirty"};
		for (int i = 0; i < expected.length; i++) {
			String actual = ite.translateEng(numbers[i]);
			assertThat(actual, is(expected[i]));
		}
	}
	
	@Test
	public void translate91to99() {
		IntToEng ite = new IntToEng();
		int[] numbers = new int[9];
		for (int i = 0; i < numbers.length; i++) numbers[i] = i+91;
		String[] expected = {"ninety one","ninety two","ninety three","ninety four","ninety five","ninety six","ninety seven","ninety eight", "ninety nine"};
		for (int i = 0; i < expected.length; i++) {
			String actual = ite.translateEng(numbers[i]);
			assertThat(actual, is(expected[i]));
		}
	}
	
	@Test
	public void translate100to109() {
		IntToEng ite = new IntToEng();
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) numbers[i] = i+100;
		String[] expected = {"one hundred","one hundred one","one hundred two","one hundred three","one hundred four","one hundred five","one hundred six","one hundred seven","one hundred eight", "one hundred nine"};
		for (int i = 0; i < expected.length; i++) {
			String actual = ite.translateEng(numbers[i]);
			assertThat(actual, is(expected[i]));
		}
	}
	
	@Test
	public void translate1000to9999() {
		IntToEng ite = new IntToEng();
		int[] numbers = {1000, 2900, 6999, 4207, 9999};
		String[] expected = {"one thousand","two thousand nine hundred","six thousand nine hundred ninety nine","four thousand two hundred seven","nine thousand nine hundred ninety nine"};
		for (int i = 0; i < expected.length; i++) {
			String actual = ite.translateEng(numbers[i]);
			assertThat(actual, is(expected[i]));
		}
	}

	@Test
	public void translate10000to999999() {
		IntToEng ite = new IntToEng();
		int[] numbers = {10000, 29001, 69909, 54207, 99999};
		String[] expected = {"ten thousand","twenty nine thousand one","sixty nine thousand nine hundred nine","fifty four thousand two hundred seven","ninety nine thousand nine hundred ninety nine"};
		for (int i = 0; i < expected.length; i++) {
			String actual = ite.translateEng(numbers[i]);
			assertThat(actual, is(expected[i]));
		}
	}
	

	@Test
	public void translate1millionto999999999() {
		IntToEng ite = new IntToEng();
		int[] numbers = {1000000, 8229001, 10569909, 666654207, 999999999};
		String[] expected = {"one million","eight million two hundred twenty nine thousand one","ten million five hundred sixty nine thousand nine hundred nine","six hundred sixty six million six hundred fifty four thousand two hundred seven","nine hundred ninety nine million nine hundred "
				+ "ninety nine thousand nine hundred ninety nine"};
		for (int i = 0; i < expected.length; i++) {
			String actual = ite.translateEng(numbers[i]);
			assertThat(actual, is(expected[i]));
		}
	}
}
