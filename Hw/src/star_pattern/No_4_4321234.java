package star_pattern;

import java.util.Scanner;

public class No_4_4321234 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int i,j;
	for(i=a;i>=1;i--)
	{
		for(j=a+i;j>=1;j--)
		{
			System.out.print(" ");
		}
		for(j=a;j>=i;j--)
		{
			System.out.print(j);
		}
		for(j=i+1;j<=a;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
}
}
