package Constructor;

import java.util.Scanner;

public class Double_n {
	double n, sum;
	
	Double_n(double n)
	{
		this.n=n;
	}
	void sum()
	{
		while(n!=0)
		{
			sum+=1/n;
			n--;
		}
		
	}
	public String toString()
	{
		return "Sum= "+sum;
	}
	public static void main(String[] args) {
		double n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		n=sc.nextDouble();
		Double_n n1=new Double_n(n);
		n1.sum();
		System.out.println(n1);
		
	}
}
