import java.util.*;
class Productofmiddle
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		int n,rem,product=1;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		n=n/10;

		while(n>9)
		{
			rem=n%10;
			product=product*rem;
			n=n/10;
		}

		System.out.println("product of middle digits is"+" "+product);
	}
}