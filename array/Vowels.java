//write a java prgm to store Vowels
import java.util.*;
class Vowels
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char a[]=new char[10]  ;         		//creation of 1d
		int i,n;
		
		System.out.println("Enter the size of array:");
		n=sc.nextInt();

		System.out.println("Enter vowels:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		System.out.print("Vowels are ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"  ");
	}
}
		