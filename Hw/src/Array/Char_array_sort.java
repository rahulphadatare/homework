package Array;

import java.util.Arrays;
public class Char_array_sort {
public static void main(String[] args) {
	char a[]= {'a','d','m','f','z','b'};
	
//	for(int i=0;i<a.length;i++)
//	{
//		for(int j=0;j<a.length;j++)
//		{
//			if(a[i]>a[j])
//			{
//				char t=a[i];
//				a[i]=a[j];
//				a[j]=t;
//			}
//		}
//	}
	
	
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	System.out.println("min char= "+a[0]);
	System.out.println("max char= "+a[a.length-1]);
}
}
