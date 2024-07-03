import java.util.*;
class Swapfirstandlast
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,firstdigit=0,lastdigit,temp1,temp2,count=0,result,digits;
		
		System.out.println("enter the value of n");
		n=sc.nextInt();

		lastdigit=n%10;

		temp1=n;
		while(temp1>0)
		{
			firstdigit=temp1%10;
			temp1=temp1/10;
		}
		temp2=n;
		while(temp2>0)
		{
			temp2=temp2/10;
			count++;
		}
		digits=count-1;
		result=lastdigit;
		result=result*(int)Math.pow(10,digits);
		result=result+n%(int)Math.pow(10,digits);
		result=result-lastdigit;
		result=result+firstdigit;
		
		System.out.println(result);
	}
}