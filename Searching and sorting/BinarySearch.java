//adam no program
import java.util.*;
class BinarySearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,keyele;

		System.out.println("Enter size of array:");
		n=sc.nextInt();

		System.out.println("Enter elements:");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		
		System.out.println("enter key element:");
		keyele=sc.nextInt();
		sort(a,n);
		binarySearch(a,n,keyele);
		
	}
	static void sort(int a[],int n)
	{
		int i,j,temp;
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
		}
	}
	static void binarySearch(int a[],int n,int keyelement)
	{
		int i,high,low=0,mid,found=0;
		high=n-1;
		
		for(i=0;i<n;i++)
		{
			mid=(high+low);
			if(a[mid]==keyelement)
			{
				found=1;
				break;
			}
			else if(keyelement>a[mid])
				low=mid+1;
			else
				high=mid-1;
		}
		if(found==1)
			System.out.println("element is found..");
		else
			System.out.println("element is not found..");
	}
}
 
	
		
		
	

	
