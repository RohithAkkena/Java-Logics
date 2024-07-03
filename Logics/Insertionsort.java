import java.util.*;
class Insertionsort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,temp,j,p;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		for(i=1;i<n;i++)
		{
			temp=a[i];
			j=i-1;
			while(j>=0&&a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			for(p=0;p<n;p++)
				System.out.print(a[p]+" ");
			System.out.println("");
		}
		for(i=0;i<n;i++)
			System.out.println(a[i]+" ");
	}
}