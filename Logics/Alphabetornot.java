import java.util.*;
class Alphabetornot
{
	public static void main(String args[])
	{
	 	Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("enter the character");
		ch=sc.next().charAt(0);
	
		if((ch>='A' && ch<='Z')||(ch>='a'&&ch<='z'))
			System.out.println("alphabet");
		else
			System.out.println("not a alphabet");
	}
}