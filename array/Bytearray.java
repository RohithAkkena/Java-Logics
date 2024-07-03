//write a java prgm input in bytes array and print it
import java.util.*;
class Bytearray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		byte a[]=new byte[10]  ;         		//creation of 1d
		int i,n;
		
		System.out.println("Enter the size of array a:");
		n=sc.nextInt();

		System.out.println("Enter  number:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextByte();
		}
		System.out.print(" nos are ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"  ");
	}
}
		