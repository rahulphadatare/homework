package Constructor;

import java.util.Scanner;

public class Numaric_value_char {
	char ch1, ch2;
	int n1,n2;
	void setCh1(char ch1)
	{
		this.ch1=ch1;
	}
	void setCh2(char ch2)
	{
		this.ch2=ch2;
	}
	void numaricvalue()
	{
		n1=(int)ch1;
		n2=(int)ch2;
	}
	void greater()
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
		return ch1+"="+n1+" & "+ch2+"="+n2;
	}
	
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any 2 character");
	char ch1=sc.next().charAt(0);
	char ch2=sc.next().charAt(0);
	Numaric_value_char c=new Numaric_value_char();
	c.setCh1(ch1);
	c.setCh2(ch2);
	c.numaricvalue();
	System.out.println(c);
	c.greater();
}
}
