package class_containment;

import java.util.Arrays;

public class Topic {
	int tid;
	String tname;
	Sub_Topic s_t[];
	
	
	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public Sub_Topic[] getS_t() {
		return s_t;
	}


	public void setS_t(Sub_Topic[] s_t) {
		this.s_t = s_t;
	}


	public String toString()
	{
		return tid+" "+tname+" "+Arrays.toString(s_t);
	}
}
