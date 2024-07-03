//write a java prgm to which reads elements in array and sort array in such ways even elements are placed at left side of array and odd elements //are placed right side of array
import java.util.*;
class Evenoddlocation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,min,max,temp;

		System.out.println("Enter the size of array");
		n=sc.nextInt();

		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		
		min=0;
		max=n-1;
		
		while(min<max)
		{
			while(a[min]%2==0 && min<max)
			min++;
			while(a[max]%2==1 && min<max)
			max--;
			
			if(min<max)
			{
				temp=a[min];
				a[min]=a[max];
				a[max]=temp;
			}
			min++;
			max--;
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}

		
		