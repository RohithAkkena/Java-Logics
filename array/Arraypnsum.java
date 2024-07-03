//write a java prgm to find sum of positive and negative numbers in given array
import java.util.*;
class Arraypnsum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10]  ;         		//creation of 1d
		int i,n,psum=0,nsum=0;
		
		System.out.println("Enter the size of array a:");
		n=sc.nextInt();

		System.out.println("Enter number:");

		for(i=0;i<n;i++)
			a[i]=sc.nextInt();

		for(i=0;i<n;i++)
		{
			if(a[i]>0)
				psum=psum+a[i];
			else
				nsum=nsum+a[i];
		}
		System.out.println("Positive no Sum is:"+psum);
		System.out.println("negative no Sum is:"+nsum);
		
	}
}
		