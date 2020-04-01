package tdd_junit;

public class main implements access{
	
public String accept(String raj)
{   String vd="";
	int dhi=raj.length();
	if(dhi>=2)
	{
		if(raj.charAt(0)!='A')
		{
			vd=vd+raj.charAt(0);
			
		}
		if(raj.charAt(1)!='A')
		{
			vd=vd+raj.charAt(1);
			
		}
		if(dhi>2)
		{
			
			vd=vd+raj.substring(2,dhi);
			
		}
		
	}
	else
	{
		if(dhi==1)
		{
			if(raj.charAt(0)!='A')
			{
				vd=vd+raj.charAt(0);
				
			}	
			
			
		}
		}
	
	return(vd);
}
}
