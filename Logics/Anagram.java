import java.util.*;
class Anagram
{
	public static void main(String args[])
	{
	    String s1="mary";
	    String s2="army";

	    int l1,l2,i,j,flag=0;
	    char temp;
		
	    l1=s1.length();
	    l2=s2.length();

	    if(l1==l2)
		{
			System.out.println("anagram is possible");
			char a1[]=s1.toCharArray();
			char a2[]=s2.toCharArray();
		
			for(i=0;i<a1.length;i++)
			{
				for(j=i+1;j<a1.length;j++)
				{
					if(a1[i]>a1[j])
					{
						temp=a1[i];
						a1[i]=a1[j];
						a1[j]=temp;
					}
					if(a2[i]>a2[j])
					{
						temp=a2[i];
						a2[i]=a2[j];
						a2[j]=temp;
					}
				}
			}
			for(i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("anagram");
			else
				System.out.println("not a anagram");
	   }
	   else
		System.out.println("anagram not possible");
	}
}