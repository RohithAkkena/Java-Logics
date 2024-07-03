import java.util.*;
class Rollnumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a[]=new String[10]; //creation of 1-D array
		int i,n;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the roll numbers");
		for(i=0;i<n;i++)
		a[i]=sc.next();
		
		System.out.println("Roll numbers are");
		for(i=0;i<n;i++)
			System.out.println(a[i]+" ");
	}
}
		
		