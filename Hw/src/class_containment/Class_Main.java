package class_containment;

import java.util.Arrays;
import java.util.Scanner;

public class Class_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Class cla[]=new Class[2];
		for(int i=0;i<1;i++)
		{
			System.out.println("Enter class id name");
			int cid=sc.nextInt();
			String cname=sc.next();
			Branch bra[]=new Branch[2];
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter branch id name");
				int bid=sc.nextInt();
				String bname=sc.next();
				Subject sub[]=new Subject[2];
				for(int k=0;k<2;k++)
				{
					System.out.println("Enter subject id name");
					int sid=sc.nextInt();
					String sname=sc.next();
					Topic top[]=new Topic[2];
					for(int l=0;l<2;l++)
					{
						System.out.println("Enter topic id name");
						int tid=sc.nextInt();
						String tname=sc.next();
						Sub_Topic subt[]=new Sub_Topic[2];
						for(int m=0;m<2;m++)
						{
							System.out.println("Enter sub topic id name");
							int stid=sc.nextInt();
							String stname=sc.next();
							Quetion que[]=new Quetion[2];
							for(int n=0;n<2;n++)
							{
								System.out.println("Enter quetion id name");
								int qid=sc.nextInt();
								String qname=sc.next();
								
								Quetion q=new Quetion();
								q.setQid(qid);
								q.setQname(qname);
								que[n]=q;
								
							}
							Sub_Topic st=new Sub_Topic();
							st.setStid(stid);
							st.setStname(stname);
							st.setQue(que);
							subt[m]=st;
						
						}
						Topic t=new Topic();
						t.setTid(tid);
						t.setTname(tname);
						t.setS_t(subt);
						top[l]=t;
					}
					Subject s=new Subject();
					s.setSid(sid);
					s.setSname(sname);
					s.setT(top);
					sub[k]=s;
				}
				Branch b=new Branch();
				b.setBid(bid);
				b.setBname(bname);
				b.setSub(sub);
				bra[j]=b;
			}
			Class c=new Class();
			c.setCid(cid);
			c.setCname(cname);
			c.setB(bra);
			cla[i]=c;
		}
		System.out.println(Arrays.toString(cla));

	}

}
