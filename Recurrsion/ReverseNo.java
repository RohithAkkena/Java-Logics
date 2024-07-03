//write a java program to find the reverse of given number using recurrsion
import java.util.*;
class ReverseNo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n:");
		n=sc.nextInt();
		
		reverseOfNumber(n);
		
	}
	
	static void reverseOfNumber(int n)
	{
		if(n>0)
		{
			System.out.println(n%10);
			reverseOfNumber(n/10);
		}
	}
}	

