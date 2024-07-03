//java prgm to find second largest number in array
import java.util.*;
class Secondlargest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n,i,large1,large2=-1;
	
		System.out.println("Enter array size");
		n=sc.nextInt();
		System.out.println("Enter numbers:");
	
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
	
		large1=a[0];

		for(i=1;i<n;i++)
		{
			if(a[i]>large1)
			{
				large1=a[i];
			}
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>large2 && (a[i]!=large1))
			large2=a[i];
		}
		System.out.println("2nd largest number is:"+large2);
		
	}
}

			
