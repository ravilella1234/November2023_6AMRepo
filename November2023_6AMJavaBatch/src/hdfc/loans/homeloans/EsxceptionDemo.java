package hdfc.loans.homeloans;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class EsxceptionDemo 
{

	public static void main(String[] args) 
	{
		int nr,dr,result;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) 
		{
			System.out.println("Eneter the nr vale : ");
			nr = sc.nextInt();
			System.out.println("Enter the dr value :");
			dr = sc.nextInt();		
			
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			} 			
		}
	}

}
