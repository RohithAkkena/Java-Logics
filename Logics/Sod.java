import java.util.*;
class Sod
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=0,rem,temp;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}

		System.out.println("sum of individual digits of"+temp+"is"+sum);
	}
}