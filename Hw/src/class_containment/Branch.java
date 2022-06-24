package class_containment;

import java.util.Arrays;

public class Branch {
	int bid;
	String bname;
	Subject sub[];

	
	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public Subject[] getSub() {
		return sub;
	}


	public void setSub(Subject[] sub) {
		this.sub = sub;
	}


	public String toString()
	{
		return bid+" "+bname+" "+Arrays.toString(sub);
	}
}
