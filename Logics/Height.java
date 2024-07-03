import java.util.*;
class Height
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float ht;
	
		System.out.println("enter the height of a person");
		ht=sc.nextFloat();

		if(ht<150.0f)
			System.out.println("Dwarf");
		else if(ht>=150.0f && ht<165.0f)
			System.out.println("Average Height");
		else if(ht>=165.0f && ht<180.0f)
			System.out.println("Taller");
		else
			System.out.println("Abnormal Height");
	}
}