import java.util.*;
class Patt19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;	
		//System.out.println("enter the value of n");
		//n=sc.nextInt();

		for(i=69;i>=65;i--)
		{
			for(j=69;j>=i;j--)
				System.out.print((char)j);
			System.out.println("");
		}
	}
}