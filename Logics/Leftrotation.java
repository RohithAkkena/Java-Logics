import java.util.*;
class Leftrotation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,first,j,nr;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		
		System.out.println("enter the number of left rotations");
		nr=sc.nextInt();

		for(i=0;i<nr;i++)
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