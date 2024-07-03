import java.util.*;
class Numbersfrom1to100
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		print(n); //calling method
		
	}
	static void print(int n)  //called method
	{
		if(n==100)
		    System.out.print(n);
		else
		    {
			System.out.print(n++ +" ");
			print(n);
		     }
	}
}