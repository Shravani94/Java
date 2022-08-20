package cj4programs;

public class finallywithcustom {
	
	public static void main(String [] args)
	{
		try {
			String str=null;
			System.out.println(str.length());
			}
		catch(Exception e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("customes exception");
		}
	}

}
