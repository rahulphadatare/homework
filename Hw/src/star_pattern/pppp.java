package star_pattern;

import java.util.Scanner;

public class pppp {
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
		for(j=i;j<=a;j++)
		{
			System.out.print(j);
		}
		for(j=a-1;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}
