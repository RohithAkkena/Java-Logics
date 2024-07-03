import java.util.*;
class Matrixmultiplication
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][5];
		int b[][]=new int[5][5];
		int c[][]=new int[5][5];
		int r1,c1,r2,c2,i,j,k;

		System.out.println("enter the size of matrix a");
		r1=sc.nextInt();
		c1=sc.nextInt();

		
		System.out.println("enter the size of matrix b");
		r2=sc.nextInt();
		c2=sc.nextInt();


		if(c1==r2)
		{
		System.out.println("matrix multiplication is possible");
		System.out.println("enter the elements into 2d array a");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the elements into 2d array b");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				c[i][j]=0;
				for(k=0;k<r2;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
	 }
	else
		System.out.println("matrix multiplication is not possible");
					
	}
		
}
		