//write a java prgm to find sum of odd and even numbers in given array
import java.util.*;
class Arrayoddevensum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10]  ;         		//creation of 1d
		int i,n,osum=0,esum=0;
		
		System.out.println("Enter the size of array a:");
		n=sc.nextInt();

		System.out.println("Enter number:");

		for(i=0;i<n;i++)
			a[i]=sc.nextInt();

		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
				esum=esum+a[i];
			else
				osum=osum+a[i];
		}
		System.out.println("Even no Sum is:"+esum);
		System.out.println("Odd no Sum is:"+osum);
		
	}
}
		