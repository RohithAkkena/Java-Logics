import java.util.*;
class Stringmethods
{
	public static void main(String args[])
	{
		String s="welcome to satya technologies";
		String s1="welcome to java world";
		String s2="WELCOME TO JAVA WORLD";
		String s3="satya";
		int i;
		System.out.println(s.charAt(5));
		System.out.println(s.length());
		System.out.println(s.equals(s1));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.isEmpty());
		System.out.println(s.replace("welcome","good"));
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,10));
		System.out.println(s.indexOf('s'));
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		String a[]=s1.split(" ");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		char b[]=s3.toCharArray();
		for(i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		s=s.concat(s1);
		System.out.println(s);
		
	}
}