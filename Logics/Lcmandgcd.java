import java.util.*;
class Lcmandgcd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,GCD,LCM;
	
		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();

		GCD=gcd_of_two(a,b); //calling method
		System.out.println("GCD of two numbers="+GCD);
		LCM=(a*b)/GCD;
		System.out.println("LCM of two numbers="+LCM);
		
	}
	static int gcd_of_two(int n1,int n2) //called method
		{
			int num,den,rem;
			if(n1>n2)
			{
				num=n1;
				den=n2;
			}
			else
			{
				num=n2;
				den=n1;
			}
			rem=num%den;
			while(rem!=0)
			{
				num=den;
				den=rem;
				rem=num%den;
			}
			return den;	
		}
			
}