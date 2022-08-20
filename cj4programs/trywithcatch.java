package cj4programs;
public class trywithcatch{
	public static void main(String[] args) {
		try {
			int a=10/0;
		}catch(Exception e) {
			System.out.println("handled");
		}
	}
	
}

