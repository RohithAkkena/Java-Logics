import java.util.*;
class Patt55
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=1;i<n;i++)
		{
		    if(i<=5)
			{
				for(j=5;j>=i;j--)
					System.out.print("*");
				System.out.println("");
			}
			else
			{
				for(j=i;j>=5;j--)
					System.out.print("*");
				System.out.println("");
			}
		}
	}
}