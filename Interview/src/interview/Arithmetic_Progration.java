package interview;

import java.util.Arrays;
import java.util.Scanner;

public class Arithmetic_Progration {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two no and also last no");
	int a2=sc.nextInt();	 //5 2nd
	int a3=sc.nextInt();	//8 3rd
	int n=sc.nextInt();		//6 itteration
	int b=a3-a2;			//8-5=3
	for(int i=3;i<n;i++) //4 5 6
	{
		a3+=b;		//8+3=11   11+3=14  14+3=17
		 
	}
	System.out.println(a3);
	
}
}
