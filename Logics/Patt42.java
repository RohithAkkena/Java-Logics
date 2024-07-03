import java.util.*;
class Patt42
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,k=1;
		System.out.println("enter the value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(k++ +" ");
			System.out.println("");
		}
	
	
	}
}