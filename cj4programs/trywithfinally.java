package cj4programs;

public class trywithfinally {
	private static Object Finally;

	public static void main(String[] args)
	{
		try {
			String str="Shravani";
			System.out.println(str);
			int a=Integer.parseInt(str);
			
		}
		catch(NumberFormatException   e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("finally block is excuted");
		}
	}

}
