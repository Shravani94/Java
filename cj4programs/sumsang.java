package cj4programs;

public class sumsang extends laptop {
	public sumsang(String brand, String genration, double price,String model) {
		super(brand, genration, price);
		this.model=model;
	}
	public void dispaly3()
	{
		display();
		System.out.println("model:"+model);
		
			}
	public static void main(String[] args)
	{
		sumsang s1=new sumsang("sumsang","windows 11",60000,"i5 intel" );
		s1.dispaly3();
		
		
	}

}
