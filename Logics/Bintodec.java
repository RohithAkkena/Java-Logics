import java.util.*;
class Bintodec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,result;

		System.out.println("enter the binary number");
		n=sc.nextInt();

		result= bin_dec(n); //calling method

		System.out.println("decimal equivalent of binary="+result);
	}
	static int bin_dec(int n) //called method
	{
		if(n==0)
		   return 0;	
		else
		   return(n%10+2*bin_dec(n/10));
	}
}