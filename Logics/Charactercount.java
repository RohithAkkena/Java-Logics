import java.util.*;
class Charactercount
{
	public static void main(String args[])
	{
		String s="aaabbbccddaaeeeffeegg";
		int a[]=new int[256];
		int i;

		for(i=0;i<s.length();i++)
		{
			a[s.charAt(i)]++;
		}
		for(i=0;i<256;i++)
		{
			if(a[i]!=0)
			System.out.println((char)i+"    "+a[i]);
		}
	}
}