package Constructor;

import java.util.Scanner;

public class No_greater {
	int n1,n2;
	void setN1(int n1)
	{
		this.n1=n1;
	}
	void setN2(int n2)
	{
		this.n2=n2;
	}
	
	void greaterno()
	{
		if(n1>n2)
		{
			System.out.println("Greater no is "+n1);
		}
		else
		{
			System.out.println("Greater no is "+n2);
		}
	}
	public String toString()
	{
		return n1+" "+n2;
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 num");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	No_greater n=new No_greater();
	n.setN1(n1);
	n.setN2(n2);
	System.out.println(n);
	n.greaterno();
	
}
}
