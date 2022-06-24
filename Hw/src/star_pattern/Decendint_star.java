package star_pattern;

import java.util.Scanner;

public class Decendint_star {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int i,j;
	for(i=a;i>=0;i--)
	{
		for(j=i;j>=1;j--)
		{
		System.out.print("*");
		}
		System.out.println();
	}
	
}
}
