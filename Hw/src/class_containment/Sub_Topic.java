package class_containment;

import java.util.Arrays;

public class Sub_Topic {
	int stid;
	String stname;
	Quetion que[];
	
	
	public int getStid() {
		return stid;
	}


	public void setStid(int stid) {
		this.stid = stid;
	}


	public String getStname() {
		return stname;
	}


	public void setStname(String stname) {
		this.stname = stname;
	}


	public Quetion[] getQue() {
		return que;
	}


	public void setQue(Quetion[] que) {
		this.que = que;
	}


	public String toString()
	{
		return stid+" "+stname+" "+Arrays.toString(que);
	}
}
