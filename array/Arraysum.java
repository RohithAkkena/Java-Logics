//write a java prgm to find sum of all array elements
import java.util.*;
class Arraysum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10]  ;         		//creation of 1d
		int i,n,sum=0;
		
		System.out.println("Enter the size of array a:");
		n=sc.nextInt();

		System.out.println("Enter roll number:");

		for(i=0;i<n;i++)
			a[i]=sc.nextInt();

		for(i=0;i<n;i++)
				sum=sum+a[i];

		System.out.print("Sum is:"+sum);
		
	}
}
		