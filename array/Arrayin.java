//write a java prgm Array initialisation
import java.util.*;
class Arrayin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		byte a[]=new byte[]{1,2,3,4,5}  ;       		//creation of 1d     OR byte a[]={1,2,3,4,5}
		int i,n;
		
		//System.out.println("Enter the size of array a:");
		//n=sc.nextInt();

		//System.out.println("Enter  number:");
		//for(i=0;i<n;i++)
		
		//	a[i]=sc.nextByte();
		
		System.out.print(" nos are ");
		for(i=0;i<5;i++)
			System.out.print(a[i]+"  ");
	}
}
		