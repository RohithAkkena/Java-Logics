//write a java prgm to perform left roration of an given array
import java.util.*;
class Roration
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,rt,j,first,last;

		System.out.println("Enter the size of array");
		n=sc.nextInt();

		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	
		System.out.println("Enter number of rorations:");
		rt=sc.nextInt();
		
		for(i=0;i<rt;i++)
		{
			first=a[0];
			for(j=0;j<n-1;j++)
				a[j]=a[j+1];
			a[n-1]=first;
	
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}

		
		