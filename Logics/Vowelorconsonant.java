import java.util.*;
class Vowelorconsonant
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			char ch;
			System.out.println("enter the character");
			ch=sc.next().charAt(0);

			switch(ch)
			{
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': System.out.println("it is a vowel");
					  break;
				default: System.out.println("it is a consonant");
					  break;
			}
		}
	}				