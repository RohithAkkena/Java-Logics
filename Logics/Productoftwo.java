import java.util.*;
class Productoftwo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,result;

		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();

		result=product_of_two(a,b); //calling method

		System.out.println("product of two numbers="+result);
	}
	static int product_of_two(int x,int y)  //called method
	{
		if(x==1)
		    return y;
		else
		    return(y+product_of_two(x-1,y));
	}
}