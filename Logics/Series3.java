import java.util.*;
class Series3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0;
		
		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			sum=sum+i*(i+2);
		}
		System.out.println("sum of the series is"+sum);
	}
}