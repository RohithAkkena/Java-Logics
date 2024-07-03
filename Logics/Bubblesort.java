import java.util.*;
class Bubblesort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,j,n,temp,p;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		for(i=0;i<n-1;i++) // n-1 passes
		{
			for(j=0;j<n-1-i;j++) // after each pass, the largest element will be at the right most side of the given array
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			for(p=0;p<n;p++)
				System.out.print(a[p]+" ");
			System.out.println("");
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}			
