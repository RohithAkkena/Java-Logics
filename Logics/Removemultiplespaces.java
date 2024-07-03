import java.util.*;
class Removemultiplespaces
{
	public static void main(String args[])
	{
		String s="welcome   to     java      world";
		String str="";
		char ch;
		int i;
		
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
				str=str+ch;
			else 
			{
				if(s.charAt(i+1)!=' ')
				  str=str+s.charAt(i);
			}		
		}
			System.out.println(str);
	}

}