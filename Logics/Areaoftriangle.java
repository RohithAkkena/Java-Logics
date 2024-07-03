import java.util.*;
class Areaoftriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float a,b,c,area;
	
		System.out.println("enter the sides of a triangle");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();

		area=area_of_triangle(a,b,c); //calling method
		System.out.println("area of triangle="+area);
		
	}
	static float area_of_triangle(float a,float b,float c) //called method
		{
			float s,area;
			s=(a+b+c)/2;
			area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
			return area;	
		}
			
}