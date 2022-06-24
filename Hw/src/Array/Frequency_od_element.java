package Array;

import java.util.Scanner;

public class Frequency_od_element {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	System.out.println("Enter "+size+" element");
	int a[]=new int[size];
	int b[]=new int[size];
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		int c=1;
		for(int j=i+1;j<size;j++)
		{
			if(a[i]==a[j] )
			{
				c++;
				b[j]=-1;
			}
			
		}
		if(b[i]>=0)
		{
			b[i]=c;
		//System.out.println("Frequency of "+a[i]+"="+b[i]);
		}
	}
	
	for(int i=0;i<size;i++)
	{
		if(b[i]>0)
		{
			System.out.println("Frequency of "+a[i]+"="+b[i]);
		}
	}
}
}
