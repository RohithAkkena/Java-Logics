import java.util.*;
class Largestofthree2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the values of a,b and c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		sum_of_digits(a,b,c); //calling method
		
	}
	static void sum_of_digits(int a,int b,int c) //called method
		{
			if(a>b)
			{
				if(a>c)
				{
					System.out.println("a is largest");
				}
				else
				{
					System.out.println("c is largest");
				}
			}
			else
			{
				if(b>c)
				{
					System.out.println("b is largest");
				}
				else
				{
					System.out.println("c is largest");
				}
			}
		}

			
}