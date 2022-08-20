package cj4programs;

public class ImplementationClass implements MultiLevelInheritance,MultipleInheritance{
	public void checkBankBalance()
	{
		System.out.println("enquired the bank balance");
	}
	public void deposite()
	{
		System.out.println("deposite the amount");
	}
	public void withdrew()
	{
		System.out.println("withdrew money from bank");
	}
	public static void main(String[] args)
	{
		ImplementationClass i1=new ImplementationClass();
		i1.checkBankBalance();
		i1.deposite();
		i1.withdrew();
		
	}
	

}
