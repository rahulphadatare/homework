package string;

public class Password_Username {

	String un,pass;
	Password_Username(String un, String pass)
	{
		this.un=un;
		this.pass=pass;
	}
	
	void checkUserName()
	{
		for(int i=0;i<un.length();i++)
		{
			if(un.charAt(i)==' ')
			{
				System.out.println("Userane not contains any space");
			}
		}
	}
	
	void checkPassword()
	{
	
		if(pass.length()>=8)
		{
			int sct=0;
			int nct=0;
			int act=0;
			int Act=0;
			for(int i=0;i<pass.length();i++)
			{
				if(pass.charAt(i)>='a' && pass.charAt(i)<='z')
				{
					act++;
				}
				if(pass.charAt(i)>='A' && pass.charAt(i)<='Z')
				{
					Act++;
				}
				
				 if(pass.charAt(i)>='0' && pass.charAt(i)<='9')
				{
					nct++;
				}
				 if(pass.charAt(i)=='@' || pass.charAt(i)=='#')
				{
					sct++;
				}
				
				
				
			}
			 if(act==0)
				{
					System.out.println("Password must have a character");
				}
			 if(Act==0)
				{
					System.out.println("Password must have upper character");
				}
				 if(nct==0)
				{
					System.out.println("Password must have digit");
				}
				 if(sct==0)
				{
					System.out.println("Password must have at least @ or #");
				}
				 else
				 {
					 System.out.println("Password is valid");
				 }
//			System.out.println("Password must be 8 digit long");
		}
		else
		{
			System.out.println("Pssword must at least 8 character");
			int sct=0;
			int nct=0;
			int act=0;
			int Act=0;
			for(int i=0;i<pass.length();i++)
			{
				if(pass.charAt(i)>='a' && pass.charAt(i)<='z')
				{
					act++;
				}
				if(pass.charAt(i)>='A' && pass.charAt(i)<='Z')
				{
					Act++;
				}
				if(pass.charAt(i)>='0' && pass.charAt(i)<='9')
				{
					nct++;
				}
				if(pass.charAt(i)=='@' && pass.charAt(i)=='#')
				{
					sct++;
				}
			}
			if(act==0)
			{
				System.out.println("Password must have a character");
			}
			if(Act==0)
			{
				System.out.println("Password must have upper character");
			}
			 if(nct==0)
			{
				System.out.println("Password must have digit");
			}
			 if(sct==0)
			{
				System.out.println("Password must have at least @ or #");
			}
		
	}
	}
}
