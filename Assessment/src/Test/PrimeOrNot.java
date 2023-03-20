package Test;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		System.out.println("Given Number :");
		int num = n.nextInt();

		if (num % 2 == 1) {
			System.out.println(num + " is Prime");
		} else {
			System.out.println(num + " is not Prime");
		}
	}
}
