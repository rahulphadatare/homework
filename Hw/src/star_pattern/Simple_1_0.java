package star_pattern;

import java.util.Scanner;

public class Simple_1_0 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int i,j;
	for(i=1;i<=a;i++)
	{
		for(j=1;j<=a;j++)
		{
			int b=(i+j)%2;
			System.out.print(b);
		}
		System.out.println();
	}
}
}
