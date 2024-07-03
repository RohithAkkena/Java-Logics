import java.util.*;
class Range
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,sum;
		
		System.out.println("enter the values of a,b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		sum=a+b+c;
		
		if(sum>=100 && sum<200)
			System.out.println(sum+"is in range of 100 to 200");
		else
			System.out.println(sum+"is not in range of 100 to 200");
	}
}