import java.util.*;
class Rowsumandcolsum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][5];
		int row,col,i,j,rsum=0,csum=0;
		
		
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
			System.out.println(rsum);
		}
		for(i=0;i<row;i++)
		{
			csum=0;
			for(j=0;j<col;j++)
			{
				csum=csum+a[j][i];
			}
			System.out.println(csum);
		}
					
	}
}
