import java.util.*;
class Bytevalues
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		byte a[]=new byte[10]; //creation of 1-D array of type byte
		int i,n;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the values");
		for(i=0;i<n;i++)
		a[i]=sc.nextByte();
		
		System.out.println("values are");
		for(i=0;i<n;i++)
			System.out.println(a[i]+" ");
	}
}
		
		