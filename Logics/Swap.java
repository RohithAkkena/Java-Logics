import java.util.*;
class Swap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;

		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("value of a="+a+" "+"value of b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("value of a="+a+" "+"value of b="+b);
	}
}