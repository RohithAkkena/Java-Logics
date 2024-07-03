import java.util.*;
class Sumofdigits2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int result;

		result=sum_of_digits(); //calling method
		System.out.println("sum of digits of given number="+result);
	}
	static int sum_of_digits() //called method
		{
			int n=1234,rem,sum=0;
			while(n>0)
			{
				rem=n%10;
				sum=sum+rem;
				n=n/10;
			}
			return sum;
		}

			
}