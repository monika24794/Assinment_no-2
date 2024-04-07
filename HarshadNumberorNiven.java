package assignment;

import java.util.Scanner;

public class HarshadNumberorNiven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter number to check its harshad number or not");
		num = sc.nextInt();
		int result = 0;
		int i = num;
		while (i > 0) {
			result = result + num % 10;
			i--;
		}

		if (num % result == 0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");
	}

}
