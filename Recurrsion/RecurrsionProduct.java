//write a java program to find product of 2 no. using recurrsion
import java.util.*;
class RecurrsionProduct
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,result;
		System.out.println("Enter first number:");
		a=sc.nextInt();
		System.out.println("Enter 2nd number:");
		b=sc.nextInt();
		
		result=product_of_two(a,b);
		System.out.println("Product is "+result);
	}
	
	static int product_of_two(int x,int y)
	{
		if(x==1)
			return y;
		else
			return(y+product_of_two(x-1,y));
	}
}	

