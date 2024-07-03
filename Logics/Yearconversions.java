import java.util.*;
class Yearconversions
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int years,choice,months,days,hours,minutes,seconds;
		System.out.println("***********CONVERSIONS***********");
		System.out.println("1:MONTHS");
		System.out.println("2:DAYS");
		System.out.println("3:HOURS");
		System.out.println("4:MINUTES");
		System.out.println("5:SECONDS");
		
		System.out.println("Enter the number of years");
		years=sc.nextInt();
		System.out.println("enter the choice");
		choice=sc.nextInt();

		months=years*12;
		days=months*30;
		hours=days*24;
		minutes=hours*60;
		seconds=minutes*60;

		switch(choice)
		{
			case 1: System.out.println("months="+months);
				break;
			case 2: System.out.println("days="+days);
				break;
			case 3: System.out.println("hours="+hours);
				break;
			case 4: System.out.println("minutes="+minutes);
				break;
			case 5: System.out.println("seconds="+seconds);
				break;
			default: System.out.println("Invalid Option");
				break;
		}
	}
}