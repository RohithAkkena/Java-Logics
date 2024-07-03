import java.util.*;
class Eachstringreverse
{
	public static void main(String args[])
	{
		String s[]={"sachin","rahul","kapil","sehwag","dhoni"};
		String str="";
		int i,j;
		for(i=0;i<s.length;i++)
		{
			str=s[i];
			for(j=str.length()-1;j>=0;j--)
				System.out.print(str.charAt(j));
			System.out.println("");
		}
		
	}
}
			  
