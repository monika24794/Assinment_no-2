package assignment;

import java.util.Scanner;

public class FiboUsingItreation {
	static int num1 = 0, num2 = 1, num3 = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter number to find fibonacci");
		num = sc.nextInt();
		System.out.print(+num1 + " " + num2);

		for (int i = 2; i <= num; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(" " + num3);
		}

	}
}
