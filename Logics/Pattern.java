import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,temp;

		System.out.println("enter the value of n");
		n=sc.nextInt();
		
		temp=n;
		while(n>=0)
		{
			System.out.print(n+" ");
			n--;
		}
		i=1;
		while(i<=temp)
		{
			System.out.print(i+" ");
			i++;
		}
	}
}
		
	