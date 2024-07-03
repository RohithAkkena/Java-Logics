//write a java prgm to insert a element at desired location in array
import java.util.*;
class Insertion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n=0,element,location;

		System.out.println("Enter the size of array");
		n=sc.nextInt();

		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		
		System.out.println("Enter the element to be inserted:");
		element=sc.nextInt();

		System.out.println("Enter the location:");
		location=sc.nextInt();		
		
		for(i=n;i>=location;i--)
		{
			a[i]=a[i-1];
		}
		a[i]=element;
		n++;
		
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}

		
		