import java.util.*;
class Strong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,temp,rem,fact,sum=0,i;
	
		System.out.println("enter the number");
		n=sc.nextInt();

		temp=n;
		for(;temp>0;)
		{
			rem=temp%10;
			if(rem==0)
			   fact=1;
			else
			{
			    fact=1;
			    for(i=1;i<=rem;i++)
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(n==sum)
			System.out.println("strong number");
		else
			System.out.println("not a strong number");
	}
}