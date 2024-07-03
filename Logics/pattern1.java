import java.util.*;
class Pattern1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,k=0;
		System.out.println("enter the value of n");
		n=sc.nextInt();

		
		k=k-n;
		n=n+1;

		while(n!=k)
		{
			System.out.print(Math.abs(k)+" ");
			k++;
		}
	}
}