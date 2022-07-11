package array;

public class Small_Diff {
public static void main(String[] args) {
	
	int a[]= {5,2,7,2,6,2,6,8,3,8};
	int min=Integer.MAX_VALUE;
	int p=0;
	int p1=0;
	for(int i=0;i<a.length;i++)
	{
		if(i%2==0)
		{
			//System.out.println("h");
			int sum=a[i]-a[i+1];
			if(min>sum && sum>0)
			{
				min=sum;
				p=a[i];
				p1=a[i+1];
			}
		}
	}
	System.out.println(p+" "+p1+"   "+min);
}
}
