import java.util.*;
class Sodtillsingle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.println("enter the value of n");
		n=sc.nextInt();
	
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
			if(n==0&&sum>9)
			 {
				n=sum;
				sum=0;
			 }
		}
		System.out.println(sum);
	}
}