import java.util.*;
class Largestofthree
{
	public static void main(String args[])
	{
		int a=3,b=5,c=4,largest;
		largest=((a>b)&&(a>c))?a:((b>c)?b:c);
		System.out.println("largest of three numbers is"+" "+largest);
	}
}