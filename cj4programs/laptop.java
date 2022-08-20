package cj4programs;
//heirarchical inheritance
public class laptop {
	public String brand;
	public String genration;
	public double price;
	public String processer;
	public String model;
	public laptop(String brand,String genration,double price)
	{
		this.brand=brand;
		this.genration=genration;
		
	}
	public  void display()
	{
		System.out.println("Dell laptop details");
		System.out.println("-------------------");
		System.out.println("Brand is"+brand);
		System.out.println("Generation is "+genration);
		System.out.println("Model is "+model);
		
		
		
	}

}

