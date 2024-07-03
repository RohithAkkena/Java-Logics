import java.util.*;
class Largestofsix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e,f;
	
		System.out.println("enter the values of a,b,c,d,e,f");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();

		if((a>b)&&(a>c)&&(a>d)&&(a>e)&&(a>f))
			System.out.println("a is largest");
		else if((b>a)&&(b>c)&&(b>d)&&(b>e)&&(b>f))
			System.out.println("b is largest");
		else if((c>a)&&(c>d)&&(c>d)&&(c>e)&&(c>f))
			System.out.println("c is largest");
		else if((d>a)&&(d>b)&&(d>c)&&(d>e)&&(d>f))
			System.out.println("d is largest");
		else if((e>a)&&(e>b)&&(e>c)&&(e>d)&&(e>f))
			System.out.println("e is largest");
		else
			System.out.println("f is largest");
	}
}