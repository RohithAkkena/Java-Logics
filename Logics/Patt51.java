import java.util.*;
class Patt51
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
			for(j=1;j<=2*i-1;j++)
			{
				if(i==1||i==n||j==1||j==2*i-1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println("");
		}
	
	
	}
}