import java.util.*;
class Secondlargest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,large1,large2;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		large1=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]>large1)
				large1=a[i];
		}
		large2=-999;
		for(i=0;i<n;i++)
		{
			if(a[i]>large2 && a[i]!=large1)
				large2=a[i];
		}
		System.out.println("second largest element in a given array is"+large2);	
	}
}