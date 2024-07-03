import java.util.*;
class Patt56
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,k=1,p;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(k++);
			for(j=i-1;j>=1;j--)
			{
				p=k-2;
				k=k-1;
				System.out.print(p);
			}
			System.out.println("");    	
		}
	}
}