import java.util.*;
class Stringpalindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="madam";
		String str=""; // empty string
		int i;
		for(i=s.length()-1;i>=0;i--)
			str=str+s.charAt(i);
		if(s.equals(str))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
			
	}
		
}