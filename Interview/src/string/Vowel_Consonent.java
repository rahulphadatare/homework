package string;

public class Vowel_Consonent {
	static int a=5;
public static void main(String[] args) {
	
	String s="hello how are you";
	int vcnt=0;
	int ccnt=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			vcnt++;
		}
		else
		{
			if(s.charAt(i)!=' ')
			{
				ccnt++;
			}
		}
	}
	System.out.println("vowel= "+vcnt);
	System.out.println("consonent= "+ccnt);
}
}
