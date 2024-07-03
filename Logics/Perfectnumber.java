import java.util.*;
class Perfectnumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,sum=0,n;

		System.out.println("enter the value of n");
		n=sc.nextInt();
		
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			   sum=sum+i;
		}
		if(sum==n)
			System.out.println("perfect number");
		else
			System.out.println("not a perfect number");
		
	}
}