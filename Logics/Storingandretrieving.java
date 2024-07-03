import java.util.*;
class Storingandretrieving
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][5];
		int row,col,i,j;

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
		System.out.println("2d array a elements are");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
		