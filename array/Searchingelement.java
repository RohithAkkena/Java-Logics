//write a java prgm to search element and note its position and print it
import java.util.*;
class Searchingelement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n,i,num,found=0,pos=0;
	
		System.out.println("Enter array size");
		n=sc.nextInt();
		System.out.println("Enter numbers:");
	
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
	
		System.out.println("Enter key element:");
		num=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(a[i]==num)
			{
				found=1;
				pos=i;
				break;
			}
		}
		if(found==1)
			System.out.println(num+" Key element is found at position "+(pos+1));
		else
			System.out.println("Key element is not found");
	}
}

			