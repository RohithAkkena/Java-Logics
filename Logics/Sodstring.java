import java.util.*;
class Sodstring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="satyatech@123.org";
		char ch;
		int i,sum=0;
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
				sum=sum+(ch-48);
		}	
		System.out.println(sum);
		
	}
		
}