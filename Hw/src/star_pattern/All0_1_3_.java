package star_pattern;

import java.util.Scanner;

public class All0_1_3_ {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int i,j;
	for(i=0;i<=a;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("0");
		}
		System.out.print(i);
		for(j=a-i;j>=1;j--)
		{
			System.out.print("0");
		}
		System.out.println();
	}
}
}
