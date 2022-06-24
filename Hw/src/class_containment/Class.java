package class_containment;

import java.util.Arrays;

public class Class {
	int cid;
	String cname;
	Branch b[];

	
	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public Branch[] getB() {
		return b;
	}


	public void setB(Branch[] b) {
		this.b = b;
	}


	public String toString()
	{
		return cid+" "+cname+" "+Arrays.toString(b);
	}
}
