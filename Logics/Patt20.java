import java.util.*;
class Patt20
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		char i,j;
		//System.out.println("enter the value of n");
		//n=sc.nextInt();

		for(i='A';i<='E';i++)
		{
			for(j='E';j>=i;j--)
				System.out.print(j);
			System.out.println("");
		}
	}
}