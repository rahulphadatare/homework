package class_containment;

import java.util.Arrays;

public class Subject {
	int sid;
	String sname;
	Topic t[];

	
	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Topic[] getT() {
		return t;
	}


	public void setT(Topic[] t) {
		this.t = t;
	}


	public String toString()
	{
		return sid+" "+sname+" "+Arrays.toString(t);
	}
}
