import java.util.*;
class Patt39
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print("*"+" ");
			System.out.println("");
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			for(j=i;j>=1;j--)
				System.out.print("*"+" ");
			System.out.println("");
		}
			
	}
}