package string;

import java.util.Arrays;

public class Vowel {
public static void main(String[] args) {
	String s="hello how are you";
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		{
			ch[i]=(char)((int)ch[i]-32);
		}
	}
	System.out.println(Arrays.toString(ch));
	String str=new String(ch);
	System.out.println(str);
}
}
