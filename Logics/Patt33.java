import java.util.*;
class Patt33
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=5;i>=1;i--)
		{
			for(j=i;j>1;j--)
				System.out.print(" ");
			for(j=i;j<=n;j++)
				System.out.print(j);
			System.out.println("");
		}
	}
}