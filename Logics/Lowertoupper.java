import java.util.*;
class Lowertoupper
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("enter the character");
		ch=sc.next().charAt(0);
		
		if(ch>='A'&&ch<='Z')
			ch=(char)(ch+32);
		else
			ch=(char)(ch-32);
		System.out.println(ch);
	}
		
}