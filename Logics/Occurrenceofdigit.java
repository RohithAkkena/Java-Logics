import java.util.*;
class Occurrenceofdigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rem,digit,count=0;
		
		System.out.println("enter the value of n");
		n=sc.nextInt();

		System.out.println("enter the digit");
		digit=sc.nextInt();

		while(n>0)
		{
			rem=n%10;
			if(rem==digit)
			    count++;
			n=n/10;
		}
		System.out.println("number of times the digit occurred in the given number is"+count);

	}
}