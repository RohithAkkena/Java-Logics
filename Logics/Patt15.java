import java.util.*;
class Patt15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;	
		//System.out.println("enter the value of n");
		//n=sc.nextInt();

		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
				System.out.print(i);
			System.out.println("");
		}
	}
}