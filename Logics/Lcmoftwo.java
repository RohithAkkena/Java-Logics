import java.util.*;
class Lcmoftwo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int largest,a,b,lcm=0,i;

		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		
		largest=(a>b)?a:b;

		for(i=1;i<largest;i++)
		{
			if((largest%a==0)&&(largest%b==0))
			{
				lcm=largest;
				break;
			}
		   largest++;
		}
		System.out.println("lcm="+lcm);
	}
}