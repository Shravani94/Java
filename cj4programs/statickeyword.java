package cj4programs;

public class statickeyword {
	public static int a=10;
	public double b=12.0;
	public static void show()
	{
		System.out.println("static method");
		
	}
	public void watch()
	{
		System.out.println("watch method");
	}
	public static void main(String[] args)
	{
		show();//access directly
		//watch() cant access with out reference
		statickeyword s1=new statickeyword();
		statickeyword.show();// access by using class name
		System.out.println(s1.a);//can access by reference also
		System.out.println(s1.b);
		
		
		
	}

}
