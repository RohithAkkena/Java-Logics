import java.util.*;
class Count
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char a[]={'s','a','t','y','a','@','1','2','3'};
		int i,al=0,d=0,ss=0;
		for(i=0;i<a.length;i++)
		{
			if((a[i]>='A'&&a[i]<='Z')||(a[i]>='a'&&a[i]<='z'))
				al++;
			else if(a[i]>='0'&&a[i]<='9')
				d++;
			else
				ss++;
			
		}
			System.out.println(al);
			System.out.println(d);
			System.out.println(ss);
			
	}
		
}