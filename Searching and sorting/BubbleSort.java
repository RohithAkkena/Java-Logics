//bubble sorting
import java.util.*;
class BubbleSort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,keyele;

		System.out.println("Enter size of array:");
		n=sc.nextInt();

		System.out.println("Enter elements:");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		
		bubbleSort(a,n);
		
	}
	static void bubbleSort(int a[],int n)
	{
		int i,j,temp;
		for(i=0;i<n;i++)		//n-1 passes
		{
			for(j=0;j<n-1-i;j++)	//after each pass largest element will right most side	
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			for(int p=0;p<n;p++)
				System.out.print(a[p]+" ");
			System.out.println();
		}
		
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}		
	

	
