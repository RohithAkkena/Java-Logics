//write a java prgm to find max occurance no
import java.util.*;
class Maxoccurance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,j,count=0,max_count=0,max_element=0;

		System.out.println("Enter the size of array");
		n=sc.nextInt();

		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	
		
		
		for(i=0;i<n;i++)
		{
			count=1;
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				count++;
			}
			if(count>max_count)
			{
				max_count=count;
				max_element=a[i];
			}
		}
		
		System.out.print("Maximum occourance number is: "+max_element+" with frequancy: "+max_count);
	}
}

		
		