import java.util.*;
class Areaandcircumference
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float radius,area,circumference;

		System.out.println("enter the radius");
		radius=sc.nextFloat();

		area=3.142f*radius*radius;
		circumference=2*3.142f*radius;

		System.out.println("area of cirlce="+area);
		System.out.println("Circumference of circle="+circumference);
	}
}