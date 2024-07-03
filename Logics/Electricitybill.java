import java.util.*;
class Electricitybill
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int previous_reading,current_reading,total_units;
		float electricity_bill;
		
		System.out.println("enter the current and previous meter reading");
		current_reading=sc.nextInt();
		previous_reading=sc.nextInt();

		total_units=current_reading-previous_reading;

		if(total_units>=200 && total_units<500)
			electricity_bill=total_units*3.50f;
		else if(total_units>=100 && total_units<200)
			electricity_bill=total_units*2.50f;
		else
			electricity_bill=total_units*1.50f;
		
		System.out.println("Electricity bill for"+total_units+"is"+electricity_bill);
		}
}
		