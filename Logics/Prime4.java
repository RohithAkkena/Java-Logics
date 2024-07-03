import java.util.*;
class Prime4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,flag=0;
		
		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
			  flag=1;
			  break;
			}
		}
		if(flag==0)
		System.out.println(n+"is a prime number");
		else
		System.out.println(n+"is not a prime number");
	}
}