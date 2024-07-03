import java.util.*;
import java.lang.Math;

class ADAM
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rem,rev=0,rev1=0,sqr,sqrt,temp;

		System.out.println("enter the value of n");
		n=sc.nextInt();
		temp=n;
	
		sqr=temp*temp;

		while(sqr>0)
		{
			rem=sqr%10;
			rev=rev*10+rem;
			sqr=sqr/10;
		}

		sqrt=(int)Math.sqrt(rev);

		while(sqrt>0)
		{
			rem=sqrt%10;
			rev1=rev1*10+rem;
			sqrt=sqrt/10;
		}
		
		if(n==rev1)
			System.out.println(n+"is an ADAM number");
		else
			System.out.println(n+"is not an ADAM number");
	}
}
		
		