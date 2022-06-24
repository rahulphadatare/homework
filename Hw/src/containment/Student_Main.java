package containment;

import java.util.Arrays;
import java.util.Scanner;

public class Student_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Student stud[]=new Student[3];
	
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter student roll & name");
		int roll=sc.nextInt();
		String name=sc.next();
		
		Student_dept dep[]=new Student_dept[1];
		for(int j=0;j<1;j++)
		{
			System.out.println("Enter department id name");
			int did=sc.nextInt();
			String dname=sc.next();
			Student_dept s=new Student_dept();
			s.setDid(did);
			s.setDname(dname);
			
			dep[j]=s;
		}
		Student s1=new Student();
		s1.setRoll(roll);
		s1.setName(name);
		s1.setStud(dep);
		
		stud[i]=s1;
	}
	
	System.out.println(Arrays.toString(stud));
}
}
