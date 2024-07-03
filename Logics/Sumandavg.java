import java.util.*;
class Sumandavg
{
	public static void main(String args[])
	{
		 // creation of scanner object
		Scanner sc=new Scanner(System.in);
	
		int a,b,c,sum;
		float avg;
		
		System.out.println("enter the values of a,b and c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		sum=a+b+c;
		avg=sum/3.0f;

		System.out.println("sum of three numbers is"+" "+sum);
		System.out.println("average of three numbers is"+" "+avg);
	}
}
		
		