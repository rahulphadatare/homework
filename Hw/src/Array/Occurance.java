package Array;

public class Occurance {
public static void main(String[] args) {
	int a[]= {1,2,3,1,4,5,2,6,2,3,6,4,9,-1,1};
	//int b[]=new int[a.length];
	
	System.out.println("number"+"\t"+"count" );
	for(int i=0;i<a.length;i++) 
	{
		int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j] && j<i) 
			{
				break;
			}
			else if(a[i]==a[j] && j>=i)
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println(a[i]+"\t"+count);
		}
		
	}
	
		
	

}
}
