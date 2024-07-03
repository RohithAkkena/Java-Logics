import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		int a=145;
		String result;
		result=(a/100==a%10)?"palindrome":"not";
		System.out.println(result);
	}
}