import java.util.*;
class Digitstowords
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rem,rev=0;
		System.out.println("enter the number");
		n=sc.nextInt();
		
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		while(rev>0)
		{
			rem=rev%10;
			if(rem==0)
				System.out.print("ZERO");
			else if(rem==1)
				
			/*switch(rem)
			{
				case 0: System.out.print("ZERO");
					break;
				case 1: System.out.print("ONE");
					break;
				case 2: System.out.print("TWO");
					break;
				case 3: System.out.print("THREE");
					break;
				case 4: System.out.print("FOUR");
					break;
				case 5: System.out.print("FIVE");
					break;
				case 6: System.out.print("SIX");
					break;
				case 7: System.out.print("SEVEN");
					break;
				case 8: System.out.print("EIGHT");
					break;
				case 9: System.out.print("NINE");
					break;
			}*/
			rev=rev/10;
        	  }
	}
}


			