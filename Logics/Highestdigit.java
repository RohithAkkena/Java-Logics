import java.util.*;
class Highestdigit
{
	public static void main(String args[])
	{
		String s="satya@4578797";
		char ch;
		int i,n=0,x=0;
		
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
				n=ch-48;
			if(n>x)
			   x=n;
		}
		System.out.println("highest digit in the given string="+x);
	}
}
			  
