import java.util.*;
class Primefactors
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		
		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=2;i<n;i++)
		{
			while(n%i==0)
			{
			  System.out.print(i+" ");
			  n=n/i;
			}
		}
		if(n>2)
			System.out.print(n);
	}
}