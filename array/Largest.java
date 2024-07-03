//write a java program to find largest element in given array//write a java prgm to sort elements in given array
import java.util.*;
class Largest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n,i,largest;
	
		System.out.println("Enter array size");
		n=sc.nextInt();
		System.out.println("Enter numbers:");
	
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
	
		largest=a[0];

		for(i=1;i<n;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
			
		System.out.println("Largest number is:"+largest);
		
	}
}

			
