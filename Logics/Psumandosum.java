import java.util.*;
class Psumandosum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][5];
		int row,col,i,j,psum=0,osum=0;
		
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
				if(i==j)
				   psum=psum+a[i][j];
				if(a[i][j]==a[i][col-1-i]) //if(i+j==row-1)
				   osum=osum+a[i][j];
			}
		}
		
		System.out.println("sum of principle diagonal elements="+psum);
		System.out.println("sum of other diagonal elements="+osum);
	}
}
