import java.util.*;
class Sumoftwomatrices
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][5];
		int b[][]=new int[5][5];
		int c[][]=new int[5][5];
		int row,col,i,j;

		System.out.println("enter the size of matrix a and b");
		row=sc.nextInt();
		col=sc.nextInt();

		System.out.println("enter the elements into 2d array a");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the elements into 2d array b");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(c[i][j]+" ");
			}	
			System.out.println("");
		}
	}
		
}
		