package star_pattern;

import java.util.Scanner;

public class No_pi {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int a = sc.nextInt();
		int j;
		for (int i = 1; i <= a; i++) {
			for (j = a - i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
}
