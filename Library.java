import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 
import java.util.Collections; 
public class Library 
{
	static ArrayList <Patron> UserList = new ArrayList<Patron>();
	static ArrayList <String> BookList = new ArrayList <String> (); 

	public static String status;
	public static String borrower; 
	public static String borrowDate; 
	public static String returnDate; 
	public String status1 = "Available";
	public String status2 = "Borrowed";
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int choice = 0;
		System.out.println("********************Welcome to the Public Library!********************");
		System.out.println("              Please Select From The Following Options:               ");
		System.out.println("**********************************************************************");
		while(choice != 9)
		{
			System.out.println("1: Add new patron");
			System.out.println("2: Add new book");
			System.out.println("3: Edit patron");
			System.out.println("4: Edit book");
			System.out.println("5: Display all patrons");
			System.out.println("6: Display all books");
			System.out.println("7: Check out book");
			System.out.println("8: Check in book");
			System.out.println("9: Search book");
			System.out.println("10: Search Patron");
			System.out.println("9: Exit");
			choice = input.nextInt();
		switch(choice)
		{
		case 1: 
			System.out.print("Enter patron first name: ");
			String firstName = input.next(); 
			System.out.print("Enter patron last name: ");
			String lastName = input.next(); 
			UserList.add(new Patron(firstName, lastName)); 
			System.out.println("-----You have successfully added a new patron!-----");
			break; 				
		case 2: 
			System.out.print("Enter book title: ");
			String title1 = input.next();	
			Scanner input1 = new Scanner(System.in);
			System.out.print("Enter book author: ");
			String author1 = input.next(); 
			Book book1 = new Book(title1);				
			BookList.add(title1);
			FullBookList.add(fullBook);
			System.out.println("-----You have successfully added a new book!-----");
			status = "available";
			borrowDate = "none";
			returnDate = "none";
			borrower = "none";
			break; 
		case 3:
			System.out.println("Enter original patron name: ");
			String originalName = input.next(); 
			System.out.println("Enter edited patron name: ");
			String editedName = input.next(); 
			if(UserList.contains(originalName))
			{	
			}
		case 4: 
		case 5: 
				System.out.println(UserList); 
				break; 
		case 6:
				System.out.println(BookList); 
				break; 
				
		case 7: 
				Patron.CheckOutBook(); 
				break; 
		case 8: 
				Patron.CheckInBook(); 
				break; 
			}
		}
	}
}