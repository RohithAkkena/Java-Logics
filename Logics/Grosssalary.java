import java.util.*;
class Grosssalary
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		int basic_salary,Conveyance;
		float DA,HRA,gross_salary;

		System.out.println("enter the basic salary of an employee");
		basic_salary=sc.nextInt();
		
		if(basic_salary>=5000)
		{
			DA=(basic_salary*110)/100;
			HRA=(basic_salary*20)/100;
			Conveyance=500;
		}
		else if(basic_salary>=3000 && basic_salary<5000)
		{
			DA=(basic_salary*100)/100;
			HRA=(basic_salary*15)/100;
			Conveyance=300;
		}
		else
		{
			DA=(basic_salary*90)/100;
			HRA=(basic_salary*10)/100;
			Conveyance=200;
		}
		gross_salary=basic_salary+DA+HRA+Conveyance;
		
		System.out.println("gross salary of an employee is"+gross_salary);
	}
}