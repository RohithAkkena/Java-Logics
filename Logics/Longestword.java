import java.util.*;
class Longestword
{
	public static void main(String args[])
	{
		String s="welcome to satya technologies";
		String a[]=s.split(" ");
		int i,pos=0;
		int longest=a[0].length();

		for(i=1;i<a.length;i++)
		{
			if(a[i].length()>longest)
			{
				longest=a[i].length();
				pos=i;
			}
		}
		System.out.println("longest string="+a[pos]);
	}
}
		