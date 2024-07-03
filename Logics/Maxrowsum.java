import java.util.*;
class Maxrowsum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][5];
		int row,col,i,j,rsum=0,k=0,large;
		int b[]=new int[5];
		
		
		System.out.println("enter the size of matrix a");
		row=sc.nextInt();
		col=sc.nextInt();

		System.out.println("enter the elements of matrix a");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<row;i++)
		{
			rsum=0;
			for(j=0;j<col;j++)
			{
				rsum=rsum+a[i][j];
			}
			b[k]=rsum;
			k++;
		}
		large=b[0];
		for(i=1;i<k;i++)
		{
			if(b[i]>large)
				large=b[i];
		}
		System.out.println("maximum row sum="+large);
					
	}
}
