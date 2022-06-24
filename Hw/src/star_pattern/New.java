package star_pattern;

import java.util.Scanner;

public class New {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int i,j;

	for(i=0;i<=a;i++)
	{
		int m=1;
//		int b=0;
		for(j=0;j<=0;j++)
		{
			System.out.print(j);
			
		}
		for(j=1;j<=1;j++)
		{
			System.out.print(j);
		}
		for(j=2;j<=i+1;j++)
		{
			System.out.print(m);
			m+=1;
		}
		System.out.println();
	}
}
}
