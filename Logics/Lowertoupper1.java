import java.util.*;
class Lowertoupper1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="satya";
		String str="";
		char ch;
		int i;
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
				str=str+(char)(ch-32);
		}	
		System.out.println(str);
		
	}
		
}