package array;

import java.util.Arrays;

public class Even_odd {
public static void main(String[] args) {
	int a[]= {1,4,7,2,8,9,11,15,1,8};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]%2==1)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
}
