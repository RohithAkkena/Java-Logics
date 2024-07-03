import java.util.*;
class Student{
	int roll_no;
	String name;
	Student (int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
}
class arrayobject
	{
		public static void main(String args[])
		{
			Student s[]=new Student[10];
			int i;
		
			
			s[0]=new Student(1,"SACHIN");
			s[1]=new Student(2,"SEHWAG");
			s[2]=new Student(3,"KAPIL");
			s[3]=new Student(4,"RAHUL");
			s[4]=new Student(5,"DHONI");

			for(i=0;i<5;i++)
					System.out.println(s[i].roll_no+" "+s[i].name);
		}
	}
