package Employeee;

import java.util.Arrays;
import java.util.Scanner;

public class Emp_main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	int size=sc.nextInt();
	Emp a[]=new Emp[size];
	for(int i=0;i<size;i++)
	{
		
		System.out.println("Enter id name dept sal");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		int sal=sc.nextInt();
		
		//e1.Emp(id, name, dept, sal);
		a[i]=new Emp(id,name,dept,sal);
	}
	
	for(Emp e:a)
	{
		if(e.sal>10000)
		{
		System.out.println(e);
		}
	}
	//or
	//System.out.println(Arrays.toString(a));
}
}
