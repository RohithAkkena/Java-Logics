//write a java prgm to store 
import java.util.*;
class Rollnumber1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a[]=new String[10]  ;         		//creation of 1d
	
		int i,n;
		
		System.out.println("Enter the size of array a:");
		n=sc.nextInt();

		System.out.println("Enter roll number:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		System.out.print("Roll nos are ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"  ");
	}
}
		