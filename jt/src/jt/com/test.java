package jt.com;

public class test {
	char[] ch = { 'a', 'b', 'c' };
	public static void main(String args[]) {
	     String str2="good";	
	     String str = new String("good");
	     String str3 = new String("good");
	     System.out.println(str==str3);
	     System.out.println(str.equals(str3));
	}
}