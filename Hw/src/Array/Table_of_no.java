package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Table_of_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no for creat a table");
	int n=sc.nextInt();
	int a[]=new int[10];
	int b=1;
	for(int i=0;i<10;i++)
	{
		a[i]=n*b;
		b++;
	}
	System.out.println("table of "+n+"\n"+Arrays.toString(a));
}
}
