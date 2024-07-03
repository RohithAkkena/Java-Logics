//write a java prgm roll no of n students in 1 dimension array
import java.util.*;
class Rollnumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10]  ;         		//creation of 1d
		int i,n;
		
		System.out.println("Enter the size of array a:");
		n=sc.nextInt();

		System.out.println("Enter roll number:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Roll nos are ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"  ");
	}
}
		