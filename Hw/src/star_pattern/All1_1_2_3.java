package star_pattern;

import java.util.Scanner;

public class All1_1_2_3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int r=sc.nextInt();
	int j, i;
	for(i=1;i<=r;i++)
	{
		for(j=r-i;j>=1;j--)
		{
			System.out.print("1");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(i);
		}
		
		System.out.println();
	}
}
}
