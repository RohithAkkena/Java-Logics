//write a java prgm to delete an element from desired location 1D array
import java.util.*;
class Deletion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n=0,location;

		System.out.println("Enter the size of array");
		n=sc.nextInt();

		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		
		
		System.out.println("Enter the location of element for delete:");
		location=sc.nextInt();		
		
		for(i=location-1;i<n-1;i++)
		{
			a[i]=a[i+1];
		}
		
		n--;
		
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}

		
		