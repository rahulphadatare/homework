package class_containment;

public class Quetion {
	int qid;
	String qname;
	
	
	public int getQid() {
		return qid;
	}


	public void setQid(int qid) {
		this.qid = qid;
	}


	public String getQname() {
		return qname;
	}


	public void setQname(String qname) {
		this.qname = qname;
	}


	public String toString()
	{
		return qid+" "+qname;
	}
}
