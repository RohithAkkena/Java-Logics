//write a java prgm to print the miss
import java.util.*;
class Missingele
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,j,x;

		System.out.println("Enter the size of array");
		n=sc.nextInt();

		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	
		
		x=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]-i!=0)
			{
				while(a[i]-i>x)
				{
					System.out.print(x+i+" ");	
					x++;
				}
			}
		}
	}
}

		
		