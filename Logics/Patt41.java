import java.util.*;
class Patt41
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=n;i>=1;i--)
		{
			for(j=1;j<i;j++)
				System.out.print(" ");
			for(j=i;j<=n;j++)
				System.out.print(i+" ");
			System.out.println("");
		}
		for(i=2;i<=n;i++)
		{
			for(j=1;j<i;j++)
				System.out.print(" ");
			for(j=i;j<=n;j++)
				System.out.print(i+" ");
			System.out.println("");
		}
			
	}
}