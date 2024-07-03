import java.util.*;
class Permutations
{
	public static void main(String args[])
	{
		String s="abc";
		char x,y,z;
		for(x='a';x<='c';x++)
		{
			for(y='a';y<='c';y++)
			{
				for(z='a';z<='c';z++)
				{
					if(x!=y&&y!=z&&z!=x)
						System.out.println(x+""+y+""+z);
				}
			}
		}
	}

}