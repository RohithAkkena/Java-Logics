//write a java program to find the sum of individual digits using recurrsion
import java.util.*;
class SumOfDigits1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n:");
		n=sc.nextInt();
		
		int sum=sumOfDigits(n);
		System.out.println("Sum of digits is:"+sum);
	}
	
	static int sumOfDigits(int n)
	{
		if(n==0)
			return 0;
		else
		{
			return(n%10+(sumOfDigits(n/10)));
			
		}
	}
}	

