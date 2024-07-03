import java.util.*;
class Firstandlastchar
{
	public static void main(String args[])
	{
		String s[]={"sachin","rahul","kapil","sehwag","dhoni"};
		String str="";
		int i;
		for(i=0;i<s.length;i++)
		{
			str=s[i];
			System.out.println(str.charAt(0)+"   "+str.charAt(str.length()-1));
		}
		
	}
}
			  
