import java.util.*;
class Oddnumbers
{
	public static void main(String args[])
	{
		
		int oddnum=1,sum=0;
		do
		{
		    sum=sum+oddnum;
		    oddnum=oddnum+2;
		}while(oddnum<=50);
		
		System.out.println("sum of odd numbers upto 50 is"+sum);
	}
}