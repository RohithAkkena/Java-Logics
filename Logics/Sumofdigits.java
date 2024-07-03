import java.util.*;
class Sumofdigits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,n1,n2,n3,n4,sum;

		System.out.println("enter the values of n");
		n=sc.nextInt();

		n1=n%10;
		n2=n/10;
		n3=n2%10;
		n4=n2/10;
		
		sum=n1+n3+n4;

		System.out.println("sum of digits of given number="+sum);
	}
}