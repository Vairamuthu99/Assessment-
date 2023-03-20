package Test;

import java.util.Scanner;

public class ReatedVowels {

	public static void main(String[] args) {

		int count = 0;
		System.out.println("Given statement : ");
		Scanner sc = new Scanner(System.in);
		String Vowels = sc.nextLine();

		for (int i = 0; i < Vowels.length(); i++) {
			char ch = Vowels.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Vowels in Given Statement : " + count);
	}
}
