import java.util.*;
class Patt25
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		char i,j;
		//System.out.println("enter the value of n");
		//n=sc.nextInt();

		for(i='E';i>='A';i--)
		{
			for(j=i;j<='E';j++)
				System.out.print(j);
			System.out.println("");
		}
	}
}