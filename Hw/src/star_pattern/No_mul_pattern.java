package star_pattern;

import java.util.Scanner;

public class No_mul_pattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int a=sc.nextInt();
	int i,j;
	int m=0;
	int n=1;
	for(i=1;i<=a;i++)
	{
		for(j=1;j<=i;j++)
		{
			
			
			System.out.print(m+" ");
			m+=n;
			n=m-n;
			
		}
		System.out.println();
	}
}
}
