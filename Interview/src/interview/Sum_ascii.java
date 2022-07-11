package interview;

public class Sum_ascii {
public static void main(String[] args) {
	String s="123ABC,456DEF";

	String str[]=s.split(",");
	System.out.println(str[0].compareTo(str[1]));
	int sum=0;
	int sum1=0;

		for(int j=0;j<str[0].length();j++)
		{
			sum+=str[0].charAt(j);
		}
		for(int i=0;i<str[1].length();i++)
		{
			sum1+=str[1].charAt(i);
		}
	
	System.out.println(sum-sum1);
}
}
