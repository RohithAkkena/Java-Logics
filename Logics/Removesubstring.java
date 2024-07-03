import java.util.*;
class Removesubstring
{
	public static void main(String args[])
	{
		String s="welcome to java world";
		String str="";
		String sub="java";
		int n=sub.length();
		char ch;
		int i;
		for(i=0;i<=s.length()-1;i++)
		{
			ch=s.charAt(i);
			if(ch!=sub.charAt(0))
				str=str+ch;
			else
				i=i+n;
		}
		System.out.println(str);
	}
}