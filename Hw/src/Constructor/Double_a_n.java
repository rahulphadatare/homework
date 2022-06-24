package Constructor;

import java.util.Scanner;

public class Double_a_n {

		double n,a,  total=0.00000;
		double b=1,c=2,sum, i, j;
		
		Double_a_n(double n, double a)
		{
			this.n=n;
			this.a=a;
		}
		void sum()
		{
			for(i=1;i<=a;i++)
			{
				sum=1;
				for(j=1;j<=c;j++)
				{
					sum*=a;
				}
//				System.out.println(sum);
				total+=b/sum;
//				System.out.println(total);
				b+=n;
				c+=n;
				
			}
			
		}
		public String toString()
		{
			return "Sum= "+total;
		}
		public static void main(String[] args) {
			double n,a;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter A and N");
			a=sc.nextDouble();
			n=sc.nextDouble();
			Double_a_n n1=new Double_a_n(n,a);
			n1.sum();
			System.out.println(n1);
			
		
	}

}
