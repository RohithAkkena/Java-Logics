import java.util.*;
class Specificcharacters
{
	public static void main(String args[])
	{
		String s="abc3d2e4f2l";
		char ch1,ch2;	
		int i,j;
		
		for(i=0;i<s.length();i++)
		{
			ch1=s.charAt(i);
			ch2=s.charAt(i+1);
			if(ch2>='0'&&ch2<='9')
			{
			for(j=0;j<ch2-48;j++)
				System.out.print(ch1);
			i++;
			}
			else
				System.out.print(ch1);
		}

	}

}