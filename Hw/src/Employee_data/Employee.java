package Employee_data;

public class Employee {
   
	int id,sal;
	String name;
	public Department did;
	public Department dname;
	

	
	void setId(int id)
	{
		this.id=id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setSal(int sal)
	{
		this.sal=sal;
	}
	void setDept(Department did, Department dname)
	{
		this.did=did;
		this.dname=dname;
	}
	Department getDid()
	{
		return did;
	}
	Department getDname()
	{
		return dname;
	}


	public String toString()
	{
		return id+" "+name+" "+sal+" "+ did+" ";
	}
}
