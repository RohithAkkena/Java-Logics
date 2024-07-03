//write a java program to find the factorial of given number using recurrsion
import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n:");
		n=sc.nextInt();
		
		int fact=factorial(n);
		System.out.println("Factorial is "+fact);
		
	}
	
	static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return(n*factorial(n-1));
		}
	}
}	

