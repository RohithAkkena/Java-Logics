import java.util.*;
class Sumofposandneg
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,nsum=0,psum=0;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		for(i=0;i<n;i++)
		{
			if(a[i]>0)
				psum=psum+a[i];
			else
				nsum=nsum+a[i];
		}

		System.out.println("sum of positive numbers="+psum);
		System.out.println("sum of negative numbers="+nsum);
	}
}