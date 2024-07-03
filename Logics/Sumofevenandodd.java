import java.util.*;
class Sumofevenandodd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,esum=0,osum=0;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
				esum=esum+a[i];
			else
				osum=osum+a[i];
		}

		System.out.println("sum of even numbers="+esum);
		System.out.println("sum of odd numbers="+osum);
	}
}