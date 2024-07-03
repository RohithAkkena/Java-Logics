import java.util.*;
class Prime2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,flag=0;
		
		System.out.println("enter the value of n");
		n=sc.nextInt();

		i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			{
			  flag=1;
			  break;
			}
		    i++;
		}
		if(flag==0)
			System.out.println("it is a prime number");
		else
			System.out.println("it is not a prime number");
	}
}