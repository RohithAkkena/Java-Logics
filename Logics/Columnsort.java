import java.util.*;
class Columnsort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][5];
		int row,col,i,j,temp,k;
		
		System.out.println("enter the size of 2D array a");
		row=sc.nextInt();
		col=sc.nextInt();

		System.out.println("enter the elements of 2D array a");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		for(j=0;j<col;j++)
		{
			for(i=0;i<row;i++)
			{
				for(k=i+1;k<row;k++)
				{
					if(a[i][j]>a[k][j])
					{
						temp=a[i][j];
						a[i][j]=a[k][j];
						a[k][j]=temp;
					}
				}
			}
		}
		
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