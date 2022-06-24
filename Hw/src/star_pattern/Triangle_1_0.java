package star_pattern;

import java.util.Scanner;

public class Triangle_1_0 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int i,j;
	for(i=1;i<=a;i++)
	{
		
		for(j=1;j<=i;j++)
		{
			int b=j%2;
			System.out.print(b);
		}
		System.out.println();
	}
}
}
