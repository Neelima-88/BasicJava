//Write a program on +,-,*,/ and % operators
package BasicJava;

public class Operators {

	public static void add()
	{
		int a= 100;
		int b=200;
		System.out.println(a+b);
		
	}
	
	public static void sub()
	{
		int a= 400;
		int b=200;
		int c= a-b;
		System.out.println(c);
		
	}
	
	public static void mul()
	{
		int a= 18;
		int b=27;
		int c= a*b;
		System.out.println(c);
		
	}
	
	 static void div()
	{
		int a= 88;
		int b=44;
		System.out.println(a/b);
		
	}
	
	public static void mod()
	{
		int a= 700;
		int b=200;
		System.out.println(a%b);
		
	}
	public static void main(String[] args) {
		
		add();
		sub();
		mul();
		div();
		mod();

	}

}
