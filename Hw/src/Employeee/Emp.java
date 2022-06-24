package Employeee;

public class Emp {
	int id, sal;
	String name,dept;
	 Emp(int id, String name, String dept, int sal )
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
				
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+sal;
	}
	
}
