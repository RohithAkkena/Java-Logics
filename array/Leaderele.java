//write a java prgm to print leader element in 1d array--leader element--element is largest from right element 
//last number is bydefault leader element so it will print 2 values for leader element
import java.util.*;
class Leaderele
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,j,x;

		System.out.println("Enter the size of array");
		n=sc.nextInt();

		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				break;
			}
			if(j==n)
				System.out.println("leader element is:"+a[i]);
		}
	}
}

		
		