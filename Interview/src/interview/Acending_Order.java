package interview;

import java.util.Arrays;

public class Acending_Order {
public static void main(String[] args) {
	
	String s="java is a good programming language";
	
	String str[]=s.split(" ");
	int arr[]=new int[str.length];
//	
//	for(int i=0;i<str.length;i++)
//	{
//		int a=0;
//		for(int j=0;j<str[i].length();j++)
//		{
//			if(str[i].charAt(j)>='a' && str[i].charAt(j)<='z')
//			{
//				a+=(str[i].charAt(j)-96);
//			}
//			if(str[i].charAt(j)>='A' && str[i].charAt(j)<='Z')
//			{
//				a+=(str[i].charAt(j)-64);
//			}
//		}
//		arr[i]=a;
//	}
//	
//	
//	for(int i=0;i<str.length;i++)
//	{
//		for(int j=i+1;j<str.length;j++)
//		{
//			if(arr[i]>arr[j])
//			{
//				String temp=str[i];
//				str[i]=str[j];
//				str[j]=temp;
//			}
//		}
//	}
//	System.out.println(Arrays.toString(str));
	
	for(int i=0;i<str.length;i++)
	{
		for(int j=i+1;j<str.length;j++)
		{
			if((str[i].compareTo(str[j]))>0)
			{
				String temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(str));
}
}
