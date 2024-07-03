import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int limit,count=2,fib1=0,fib2=1,fib3;

		System.out.println("enter the limit");
		limit=sc.nextInt();
	
		System.out.print(fib1+" "+fib2+" ");
		
		do
		{
			fib3=fib1+fib2;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
			count++;
		}while(count<limit);

	}
}