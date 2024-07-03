import java.util.*;
class Tempconversion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float fahrenheit,celsius;

		System.out.println("enter the fahrenheit temperature");
		fahrenheit=sc.nextFloat();

		celsius=5/9.0f*(fahrenheit-32.0f);

		System.out.println("Celsius temperature is"+" "+celsius);
	}
}