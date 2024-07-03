import java.util.*;
class Sparsematrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][5];
		int row,col,i,j,count=0;

		
		
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
		
			for(j=0;j<col;j++)
			{
				if(a[i][j]==0)
				 count++;
			}
			
		}
		if(count>(row*col)/2)
			System.out.println("sparse matrix");
		else
			System.out.println("not a sparse matrix");			
	}
}
