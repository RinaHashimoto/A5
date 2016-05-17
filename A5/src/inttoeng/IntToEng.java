package inttoeng;

import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		System.out.println(translateEng(input));

	}

	// 数値を英訳する変換するメソッド
	static String translateEng(int n) {
		if (n < (1000*1000)) {
			return underMillion(n);
		} else if (n < (1000 * 1000 * 1000)) {
			if (n % 1000*1000 == 0)
				return underMillion(n / 1000*1000) + " million";
			else
				return underMillion(n / 1000*1000) + " million " + underMillion(n % 1000*1000);
			
		}
		return "x";
	}

	static String under100(int n) {
		String[] numbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve" };
		String[] teens = { "thir", "four", "fif", "six", "seven", "eigh", "nine" };
		String[] ties = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		if (n <= 12)
			return numbers[n];
		else if (n <= 19)
			return teens[n - 13] + "teen";
		else if (n < 100) {
			if (n % 10 == 0)
				return ties[n / 10 - 2];
			else
				return ties[n / 10 - 2] + " " + numbers[n % 10];
		}
		return "x";
	}

	static String under1000(int n) {
		if (n < 1000) {
			if (n < 100)
				return under100(n);
			if (n % 100 == 0)
				return under100(n / 100) + " hundred";
			else
				return under100(n / 100) + " hundred " + under100(n % 100);
		}
		return "x";
	}

	static String underMillion(int n) {
		if (n < 1000000) {
			if (n < 1000)
				return under1000(n);
			if (n % 1000 == 0)
				return under1000(n / 1000) + " thousand";
			else
				return under1000(n / 1000) + " thousand " + under1000(n % 1000);
		}
		return "x";
	}
	
	/*
	static String underBillion(int n) {
		if (n < 1000000) {
			if (n < 1000)
				return under1000(n);
			if (n % 1000 == 0)
				return under1000(n / 1000) + " thousand";
			else
				return under1000(n / 1000) + " thousand " + under1000(n % 1000);
		}
		return "x";
	}
	*/
}
