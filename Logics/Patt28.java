import java.util.*;
class Patt28
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
				System.out.print(" ");
			for(j=n;j>=i;j--)
				System.out.print("*");
			System.out.println("");
		}
	}
}