//write a java prgm to store boolean values in array and print on sceen
import java.util.*;
class Booleanvalues
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean a[]=new boolean[10]  ;         		//creation of 1d
		int i,n;
		
		System.out.println("Enter the size of array:");
		n=sc.nextInt();

		System.out.println("Enter vowels:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextBoolean();
		}
		System.out.print("Vowels are ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"  ");
	}
}
		