import java.util.*;
class Prime3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,flag=0;
		System.out.println("enter the value of n");
		n=sc.nextInt();

		i=2;
		do
		{
			if(n%i==0)
			{
			   flag=1;
			   break;
			}
		    i++;
		}while(i<=n/2);

		if(flag==0)
			System.out.println("prime");
		else
			System.out.println("not a prime");
	}
}