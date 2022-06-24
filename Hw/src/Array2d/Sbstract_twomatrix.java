package Array2d;

import java.util.Scanner;

public class Sbstract_twomatrix {
	
	void display(int a[][],int r, int c)
	{
		System.out.println("1st matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void display1(int b[][],int r, int c)
	{
		System.out.println("2nd matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(b[i][j]+"   ");
			}
			System.out.println();
		}
	}
	
	void substract (int a[][], int b[][], int r,int c)
	{
		System.out.println("Sustraction of two matrix ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]-b[i][j]+"   ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter r and c");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		System.out.println("Enter "+(r*c)+" no");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter "+(r*c)+" no");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		Sbstract_twomatrix m=new Sbstract_twomatrix();
		m.display(a, r, c);
		m.display1(b, r, c);
		m.substract(a, b, r, c);
	}
}
