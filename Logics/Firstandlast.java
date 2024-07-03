import java.util.*;
class Firstandlast
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		int n,firstdigit=0,lastdigit,sum;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		lastdigit=n%10;

		while(n>0)
		{
			firstdigit=n%10;
			n=n/10;
		}
		
		sum=firstdigit+lastdigit;

		System.out.println("sum of first and last digit is"+" "+sum);
	}
}