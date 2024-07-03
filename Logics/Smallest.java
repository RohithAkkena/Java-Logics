import java.util.*;
class Smallest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,small,n;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		small=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]<small)
				small=a[i];
		}
		
		System.out.println("Smallest element in a given array is"+small);	
	}
}