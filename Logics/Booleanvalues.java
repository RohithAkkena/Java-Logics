import java.util.*;
class Booleanvalues
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean a[]=new boolean[10]; //creation of 1-D array of type boolean
		int i,n;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the boolean values");
		for(i=0;i<n;i++)
		a[i]=sc.nextBoolean();
		
		System.out.println("Boolean values are");
		for(i=0;i<n;i++)
			System.out.println(a[i]+" ");
	}
}
		
		