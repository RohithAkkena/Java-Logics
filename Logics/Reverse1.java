import java.util.*;
class Reverse1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		reverse(n); //calling method
		
	}
	static void reverse(int n)  //called method
	{
		if(n>0)
		{
			System.out.print(n%10);
			reverse(n/10);
		}
	}
}