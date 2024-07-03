//write a java program to find gcd of two given numbers using recurrsion
import java.util.*;
class GCD
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2,result;

		System.out.println("Enter 1st no:");
		n1=sc.nextInt();
		System.out.println("Enter 1st no:");
		n2=sc.nextInt();
		
		result=gcd(n1,n2);
		System.out.println("GCD is "+result);
		
	}
	
	static int gcd(int n1,int n2)
	{
		if(n1==0)
			return n2;
		if(n2==0)
			return n1;
		if(n1>n2)
			return(gcd(n1%n2,n2));
		else
			return(gcd(n1,n2%n1));
	}
}	

