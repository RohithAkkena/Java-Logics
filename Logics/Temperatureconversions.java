import java.util.*;
class Temperatureconversions
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float it,ct=0,ft=0,kt=0;
		char choice;
		System.out.println("********TEMPERATURE CONVERSIONS*******");
		System.out.println("Enter the temperature");
		it=sc.nextFloat();
		System.out.println("enter the choice");
		choice=sc.next().charAt(0);

		switch(choice)
		{
			 case 'C':ct=it;
				  kt=ct+273.03f;
				  ft=(ct*9.0f)/5+32.0f;
				  break;
			 case 'F': ft=it;
				  ct=5/9.0f*(ft-32.0f);
				  kt=ct+273.03f;
				  break;
			 case 'K':kt=it;
                                  ct=kt-273.03f;
				  ft=(ct*9.0f)/5+32.0f;
				  break;
			default: System.out.println("Invalid option");
				 break;
		}
		System.out.println("Celsius temperature="+ct);
		System.out.println("fahrenheit temperature="+ft);
		System.out.println("Kelvin temperature="+kt);
	}
}
				  