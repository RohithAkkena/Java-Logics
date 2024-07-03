import java.util.*;
class Largestelement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][5];
		int row,col,i=0,j=0,large,r,c;

		System.out.println("enter the order of two dimensional array a");
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
		large=a[0][0];
		r=0;c=0;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(a[i][j]>large)
				{
					large=a[i][j];
					r=i;c=j;
				}
			}
		}
		System.out.println("largest element in a 2d array is"+large+"found at index"+"("+r+","+c+")");
		
	}
}
		