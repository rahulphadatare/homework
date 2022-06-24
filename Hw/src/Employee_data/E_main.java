package Employee_data;

import java.util.Scanner;

public class E_main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	int size =sc.nextInt();
	Employee a[]=new Employee[size];
	for(int i=0;i<size;i++)
	{
		System.out.println("Enter id name sal department id department name");
		int id=sc.nextInt();
		String name=sc.next();
		int sal=sc.nextInt();
		int did=sc.nextInt();
		String dname=sc.next();
		Employee e1=new Employee();
		e1.setId(id);
		e1.setName(name);
		e1.setSal(sal);
		//e1.dept(did, dname);
		a[i]=e1;
	}
	for(Employee e:a)
	{
		System.out.println(e);
	}
}
}
