package star_pattern;

import java.util.Scanner;

public class Start_end_star {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int i,j;
	for(i=1;i<=a;i++)
	{
		System.out.print("*");
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		for(j=i-1;j>=1;j--)
		{
			System.out.print(j);
		}
		System.out.print("*");
		System.out.println();
	}
	for(i=a-1;i>=1;i--)
	{
		System.out.print("*");
		for(j=1;j<=i;j++)
		{
			System.out.println(j);
		}                                  // 1 2 3 4 5   12345
		for(j=i-1;j>=1;j--)
		{
			System.out.print(j);
		}
		System.out.print("*");
		System.out.println();
	}
}
}
