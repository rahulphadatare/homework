package Array2d;

import java.util.Scanner;

public class Sum_minor {
	void array(int a[][], int r, int c)
	{

		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void sum(int a[][], int r, int c)
	{
		System.out.println("sum of minor daigonal ");
			int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j--)
			{
				if(i+j==r-1)
				{
					sum+=a[i][j];
				}
			}
		}
		System.out.println(sum);
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row and coloum");
	int r=sc.nextInt();
	int c=sc.nextInt();
	int a[][]=new int[r][c];
	System.out.println("Enter no "+r*c);
	

	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}	
	
	Sum_minor s=new Sum_minor();
	s.array(a, r, c);
	s.sum(a, r, c);
	
}
}
