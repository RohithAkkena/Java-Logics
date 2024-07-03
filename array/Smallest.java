//write a java program to find largest element in given array//write a java prgm to sort elements in given array
import java.util.*;
class Smallest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n,i,smallest;
	
		System.out.println("Enter array size");
		n=sc.nextInt();
		System.out.println("Enter numbers:");
	
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
	
		smallest=a[0];

		for(i=1;i<n;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
			
		System.out.println("Smallest number is:"+smallest);
		
	}
}

			
