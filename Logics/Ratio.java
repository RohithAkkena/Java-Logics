import java.util.*;
class Ratio
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float a,b,ratio,temp;
		System.out.println("enter the values of a and b");
		a=sc.nextFloat();
		b=sc.nextFloat();

		ratio=a/b;

		if(ratio>=0)
		{
			temp=a;
			a=b;
			b=temp;
		}
		System.out.println("value of a="+a+" "+"value of b="+b);
		
	}
}	