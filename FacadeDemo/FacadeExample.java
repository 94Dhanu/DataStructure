package FacadeDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeExample 
{
	private static int choice;
	public static void main(String arg[]) throws NumberFormatException, IOException 
	{
		do
		{
			
			System.out.println("Welcome to MobileShop\n");
			System.out.println("1.Iphone\n");
			System.out.println("2.Samsung\n");
			System.out.println("3.Nokia\n");
			System.out.println("4.Exit\n");
			System.out.println("Enter your Choice:");
			InputStreamReader iobj=new InputStreamReader(System.in);
			BufferedReader bobj=new BufferedReader(iobj);
			choice=Integer.parseInt(bobj.readLine());
			ShopKeeper sk=new ShopKeeper();
			switch(choice)
			{
				case 1:
				{
				
					sk.iphonesale();
					
				}
				break;
				case 2:
				{
				
					sk.samsungsale();
					
				}
				break;
				case 3:
				{
				
					sk.nokiasale();
					
				}
				break;
				
				case 4:
				{
					System.out.println("You canot Purchess");
				
				}
				return;
			}
				
				
			
		
		}while(choice!=4);
	
	
		}			
}