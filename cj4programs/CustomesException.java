package cj4programs;

public class CustomesException extends Exception {
	public CustomesException(String msg)
	{
		super(msg);
	}
	

}
class userexception
{
	public void show()throws CustomesException{
		throw new CustomesException("this is user created exception");
	}
	public static void main(String[] args)
	{
		userexception u1=new userexception();
		try {
		u1.show();
		}catch(CustomesException e1)
		{System.out.println("exception is"+e1);
		}
		
	}
}