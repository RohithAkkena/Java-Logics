import java.util.*;
class Continuedemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=0,i;
		
		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			if(i==5)
			  continue;
			sum=sum+i;
		}
		System.out.println(sum);
	}
}