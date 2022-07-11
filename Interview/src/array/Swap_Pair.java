package array;

import java.util.Arrays;

public class Swap_Pair {
public static void main(String[] args) {
	
	int a[]= {5,2,7,2,6,2,6,8,3,8};
	
	for(int i=0;i<a.length;i++)
	{
		if(i%2==0)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}
	System.out.println(Arrays.toString(a));
}
}
