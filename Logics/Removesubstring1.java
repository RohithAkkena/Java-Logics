import java.util.*;
class Removesubstring1
{
	public static void main(String args[])
	{
		String s="welcome to satya technologies";
		String a[]=s.split(" ");
		String sub="technologies";
		String str="";
		int i;
		
		for(i=0;i<a.length;i++)
		{
			if(a[i].equals(sub))
				continue;
			else
			    str=str+" "+a[i];
		}
		System.out.println(str);

	}

}