import java.util.*;
class Dectobin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,result;

		System.out.println("enter the decimal number");
		n=sc.nextInt();

		result= dec_bin(n); //calling method

		System.out.println("binary equivalent of decimal="+result);
	}
	static int dec_bin(int n) //called method
	{
		if(n==0)
		   return 0;	
		else
		   return(n%2+10*dec_bin(n/2));
	}
}