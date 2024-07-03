//write a java prgm to sort elements in given array
import java.util.*;
class Sorting
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n,i,j,temp,p;
	
		System.out.println("Enter array size");
		n=sc.nextInt();
		System.out.println("Enter numbers:");
	
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
	
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			for(p=0;p<n;p++)
				System.out.print(a[p]+" ");
		System.out.println();
		}	
		System.out.println("\n\nsorted array elements are:");
		for(i=0;i<n;i++)
			System.out.print(a[i]+ " ");
	}
}

			
