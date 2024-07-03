import java.util.*;
class Rightrotation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int nr,i,j,n,last;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		System.out.println("enter the number of rotations");
		nr=sc.nextInt();

		for(i=0;i<nr;i++)
		{
			last=a[n-1];
			for(j=n-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}