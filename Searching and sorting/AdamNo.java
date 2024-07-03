//adam no program
import java.util.*;
class AdamNo
{
	public static void main(String args[])
	{
	int n,temp,rev=0,rem,rem1,rev1=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	n=sc.nextInt();

	temp=n;
	int sqr=temp*temp;

	while(sqr>0)
	{
		rem=sqr%10;
		rev=rev*10+rem;
		sqr=sqr/10;
	}
	int sqrt=(int)Math.sqrt(rev);
	
	while(sqrt>0)
	{
		rem1=sqrt%10;
		rev1=rev1*10+rem1;
		sqrt=sqrt/10;
	}
	if(n==rev1)
		System.out.println("Adam no");
	else
		System.out.println("Not adam no");
	}
}