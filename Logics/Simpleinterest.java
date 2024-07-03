import java.util.*;
class Simpleinterest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int principle_amount,time_period;
		float rate_of_interest,SI;

		System.out.println("enter the principle amount,time period and rate of interest");
		principle_amount=sc.nextInt();
		time_period=sc.nextInt();
		rate_of_interest=sc.nextFloat();

		SI=(principle_amount*time_period*rate_of_interest)/100;
		
		System.out.println("Simple Interest="+SI);
	}
}