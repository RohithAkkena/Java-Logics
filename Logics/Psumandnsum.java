import java.util.*;
class Psumandnsum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,num,i,psum=0,nsum=0;
		
		System.out.println("enter the value of n");
		n=sc.nextInt();

		i=1;
		while(i<=n)
		{
			System.out.println("enter the number");
			num=sc.nextInt();

			if(num==0)
			    break;
			else if(num>0)
			   psum=psum+num;
			else
			   nsum=nsum+num;
		   i++;
		}
		System.out.println("sum of positive numbers="+psum);
		System.out.println("sum of negative numbers="+nsum);
	}
}