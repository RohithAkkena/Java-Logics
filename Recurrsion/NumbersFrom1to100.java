//write a java program to printing number from 1 to 100 using recurrsion
import java.util.*;
class NumbersFrom1to100
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n:");
		n=sc.nextInt();
		
		print(n);
	}
	
	static void print(int n)
	{
		if(n==100)
			System.out.print(n);
		else
		{
			System.out.print(n++ +" ");
			print(n);
		}
	}
}	

