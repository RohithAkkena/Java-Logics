import java.util.*;
class Sumofn
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		i=1;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("sum of first"+n+"natural numbers is"+sum);
	}
}