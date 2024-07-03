import java.util.*;
class Student
{
	int roll_no;
	String name;
	Student(int roll_no,String name)
	{
	   this.roll_no=roll_no;
	   this.name=name;
	}
}
class Arrayofobjects
{
	public static void main(String args[])
	{
		Student s[]=new Student[10]; 
		int i;

		s[0]=new Student(1,"sachin");
		s[1]=new Student(2,"sehwag");	
		s[2]=new Student(3,"kapil");
		s[3]=new Student(4,"rahul");
		s[4]=new Student(5,"dhoni");

		for(i=0;i<5;i++)
			System.out.println(s[i].roll_no+" "+s[i].name);
	}
}
		
		