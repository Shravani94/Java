package cj4programs;

public class trywithmultiplecatch {
	public static void main(String[] args) {
		try{
			int arr[]=new int[5];
		arr[6]=20;
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
		  catch(NullPointerException e){ 
			  System.out.println(e);
		  }
		catch(ArithmeticException e2) {
			System.out.println(e2);
		}

	}

}
