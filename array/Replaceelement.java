//write a java prgm which reads int ..read source and replace element ..update source element with replacing element
import java.util.*;
class Replaceelement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n,i,selement,relement;
	
		System.out.println("Enter array size");
		n=sc.nextInt();
		System.out.println("Enter numbers:");
	
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
	
		System.out.println("Enter source element:");
		selement=sc.nextInt();
		System.out.println("Enter replace element element:");
		relement=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(a[i]==selement)
			{
				a[i]=relement;
			}
		}
		System.out.println("New Array elements are:");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
}

			