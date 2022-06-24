package Array;

import java.util.Arrays;

public class Digit_shifting {
public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};	
		
		int n=a.length/2;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[n]+" ");
			if(n>=(a.length-1))
			{
				n=0;
			}
			else
			{
				n++;
			}
		}
		
	//	System.out.println(Arrays.toString(a));
	

}
}