package Array2d;

import java.util.Scanner;

public class Sparse_matrix {
	
	void display(int a[][],int r, int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	void sparse(int a[][],int r,int c)
	{
		int d=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(a[i][j]==0)
				{
					d++;
				}
			}
		}
		if(d>(c*r/2))
		{
			System.out.println("The matrix is Sparse");
		}
		else
		{
			System.out.println("The matrix is not sparse");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter r and c");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int [r][c];
		System.out.println("Enter "+(r*c)+" no");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		Sparse_matrix m=new Sparse_matrix();
		m.display(a, r, c);
		m.sparse(a, r, c);
	}
}
