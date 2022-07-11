package string;

import java.util.Scanner;

public class Password_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter username Password");
	String un=sc.nextLine();
	String pass=sc.nextLine();
	
	Password_Username p=new Password_Username(un,pass);
	p.checkUserName();
	p.checkPassword();
}
}
