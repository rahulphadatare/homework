package string;

public class Name {
	public static void main(String[] args) {
		String s= "Rahul Sayaji Phadatare";
		
		String str[]=s.split(" ");
		int i;
		for(i=0;i<str.length-1;i++)
		{
			System.out.print(str[i].charAt(0)+".");
		}
		System.out.print(str[i]);
	}
}
