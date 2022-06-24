package Array;

public class Sq_no {
public static void main(String[] args) {
	int a[]= {23,43,25,49,12,9,78,66,39};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=1;j<=a[i]/2;j++)
		{
			if(j*j==a[i])
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	
//	double b=Math.sqrt(43);
//	double c=Math.floor(b);
//	System.out.println(b);
//	System.out.println(c);
	
}
}
