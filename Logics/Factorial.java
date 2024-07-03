import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,fact,i;

		System.out.println("enter the value of n");
		n=sc.nextInt();
	
		if(n==0)
		    fact=1;
		else
		{
		    i=1;
		    fact=1;
		    while(i<=n)
			{
				fact=fact*i;
				i++;
			}
		}
		System.out.println("factorial of"+n+"is"+fact);
	}
}