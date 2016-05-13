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
		String[] numbers = {"zero", "one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
		String[] teens = {"thir", "four", "fif", "six", "seven", "eigh", "nine"};
		if (n <= 12) return numbers[n];
		else if (n <= 19) return teens[n-13]+"teen";
		return "";
	}
}
