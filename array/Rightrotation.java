//write a java prgm to perform right roration of an given array
import java.util.*;
class Rightroration
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
	
		System.out.println("Enter number of right rorations:");
		rt=sc.nextInt();
		
		for(i=0;i<rt;i++)
		{
			last=a[n-1];
			for(j=n-1;j>0;j--)
				a[j]=a[j-1];
			a[0]=last;
	
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}

		
		