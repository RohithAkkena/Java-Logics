import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,count=0;
		
		System.out.println("enter the value of n");
		n=sc.nextInt();

		i=1;
		while(i<=n)
		{
			if(n%i==0)
			   count++;
		    i++;
		}
		if(count==2)
			System.out.println("it is a prime number");
		else
			System.out.println("it is not a prime number");
	}
}