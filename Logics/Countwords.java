import java.util.*;
class Countwords
{
	public static void main(String args[])
	{
		String s="welcome to satya technologies";
		int i,count=0;
		char ch;
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch==' ')
			    count++;
		}
		System.out.println(count+1);
	}
}
			  
