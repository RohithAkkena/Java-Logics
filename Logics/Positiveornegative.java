import java.util.*;
class Positiveornegative
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter the number");
		num=sc.nextInt();

		if(num>0)
			System.out.println(num+"is a positive number");
		else
			System.out.println(num+"is a negative number");
		
	}
}	