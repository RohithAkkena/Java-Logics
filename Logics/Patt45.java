import java.util.*;
class Patt45
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
				{
					if(i%2==0)
						System.out.print("1");
					else
						System.out.print("0");
				}
			System.out.println("");
		}
	
	
	}
}