package cj4programs;

public class Dell extends laptop {

	public Dell(String brand, String genration, double price,String processer) {
		super(brand, genration, price);
		this.processer=processer;
	}
	public void display1()
	{
	super.	display();//super keyword can access super class members
		System.out.println("processer is:"+processer);		
	}
	public static void main(String[] args)
	{
		Dell d1=new Dell("Dell","windows 10",56000,"245 gb");
		d1.display1();
		
		
	}
	

}
