package Test;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {

		String x, y = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Give a Statement :");
		x = s.nextLine();
		int n = x.length();
		for (int i = n - 1; i > 0; i--)
			;
		{
			y = y + x.charAt(n);
		}
		if (x.equalsIgnoreCase(y)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not palindrome");
		}
	}
}
