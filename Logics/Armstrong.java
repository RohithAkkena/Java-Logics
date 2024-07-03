import java.util.*;
class Armstrong
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		int n,temp1,temp2,count=0,rem,sum=0,x,y;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		temp1=n;
		while(temp1>0)
		{
			temp1=temp1/10;
			count++;
		}
		temp2=n;
		while(temp2>0)
		{
			rem=temp2%10;
			x=1;y=count;
			while(y>0)
			{
				x=x*rem;
				y--;
			}
			sum=sum+x;
			temp2=temp2/10;
		}
		if(sum==n)
			System.out.println("it is an armstrong number");
		else
			System.out.println("not an armstrong number");
	}
}