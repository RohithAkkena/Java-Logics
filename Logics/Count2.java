import java.util.*;
class Count2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="satyatech@123.org";
		char ch;
		int i,al=0,d=0,ss=0;
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))					al++;
			else if(ch>='0'&&ch<='9')
				d++;
			else
				ss++;
		}	
		System.out.println(al);
		System.out.println(d);
		System.out.println(ss);
	}
		
}