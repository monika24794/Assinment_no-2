package assignment;

import java.util.Scanner;

public class factorialusingRecursion {

	static int fact(int num) {
		if (num == 0)
			return 1;
		else {
			return (num * (fact(num - 1)));
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter number to find factorial");
		num = sc.nextInt();
		System.out.println("factorial of number" + fact(num));

	}
}