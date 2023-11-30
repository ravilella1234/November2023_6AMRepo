package hdfc.loans.homeloans;

import java.util.Scanner;

public class UserDefineException extends Exception
{

	public UserDefineException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) 
		{
			System.out.println("Enter the string : ");
			str = sc.nextLine();
			
			try 
			{
				if (str.length() != 10) 
				{
					throw new UserDefineException("String should be 10 character");
				}
				else
				{
					System.out.println(str);
					break;
				}
			} 
			catch (UserDefineException e) 
			{
				e.printStackTrace();
			} 
		}
	}

}
