import java.util.*;
class Vowels
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char a[]=new char[10]; //creation of 1-D array of type char
		int i,n;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the vowels");
		for(i=0;i<n;i++)
		a[i]=sc.next().charAt(0);
		
		System.out.println("vowels are");
		for(i=0;i<n;i++)
			System.out.println(a[i]+" ");
	}
}
		
		