package star_pattern;

import java.util.Scanner;

public class N0_1_5_1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int r=sc.nextInt();
	int j,i;
	for(i=0;i<=r;i++)
	{
		
		for(j=1;j<=i;j++)
		{
			
			System.out.print(j);
			
		}
		
		System.out.println();
	}
	for(i=r-1;i>=1;i--)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}
