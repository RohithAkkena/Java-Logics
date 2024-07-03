import java.util.*;
class Sod1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,result;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		result=sum_of_digits(n); //calling method
		System.out.println("sum of individual digits="+result);
	}
	static int sum_of_digits(int n)  //called method
	{
		if(n==0)
		   return 0;
		else
		   return(n%10+sum_of_digits(n/10));
	}
}