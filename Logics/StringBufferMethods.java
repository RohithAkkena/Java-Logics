import java.util.*;
class StringBuffermethods
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.trimToSize();
		sb.append("welcome to satya technologies");
		
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(2));
		System.out.println(sb.length());
		System.out.println(sb.insert(8,"good"));
		System.out.println(sb.insert(8,"s"));
		System.out.println(sb.delete(5,10));
		System.out.println(sb.reverse());
		System.out.println(sb.deleteCharAt(12));
		sb.setCharAt(15,'z');
		System.out.println(sb);
		
	}
}