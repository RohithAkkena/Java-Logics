import java.util.*;
class Search
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,keyelement,found=0,pos=0;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		System.out.println("enter the keyelement need to be searched");
		keyelement=sc.nextInt();

		for(i=0;i<n;i++)
		{
			if(keyelement==a[i])
			{
				found=1;
				pos=i;
				break;
			}
		}
		if(found==1)
			System.out.println("Search is successful! Keyelement is found at index position"+pos);
		else
			System.out.println("Search is unsuccessful! Keyelement not found");
		
	}
}