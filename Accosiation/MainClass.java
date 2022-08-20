package Accosiation;

public class MainClass {
	public static void main(String [] args)
	{
		Bank b1=new Bank("icici");
		Customer c=new Customer("radhika","icici");
		System.out.println(c.name+" is an employee of "+b1.bankName);
	}

}
