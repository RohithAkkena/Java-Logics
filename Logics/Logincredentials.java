




import java.util.*;
class Logincredentials
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int password;
		String username,usr="satya@technologies.com";
		
		System.out.println("enter the username");
		username=sc.nextLine();

		System.out.println("enter the password");
		password=sc.nextInt();

		if(usr.equals(username))
			{
				if(password==12345678)
				{
					System.out.println("Valid Credentials! Login is Successful ");
				}
				else
				{
					System.out.println("Invalid password! Please try again");
				}
			}

			else
			{
				System.out.println("Invalid Username! Please try again");
			}
		
	}
}

\n