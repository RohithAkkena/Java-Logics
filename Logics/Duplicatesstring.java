import java.util.*;
class Duplicatesstring
{
	public static void main(String args[])
	{
		String s="aaabbcccaaddaaeeff";
		String str="";
		int i,j;
		
		for(i=0;i<s.length();i++)
		{
			for(j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
					break;
			}
		  if(i==j)
			str=str+s.charAt(i);
		}
			System.out.println(str);
	}

}