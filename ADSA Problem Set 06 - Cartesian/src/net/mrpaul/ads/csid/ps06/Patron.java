package net.mrpaul.ads.csid.ps06;

import java.util.Scanner;

public class Patron {

	 String patron1;
	 Book book1;
	 Book book2;
	 Book book3;

	public Patron()
	{
		Book b1 = new Book("Zero","Zero");
		b1.setBook("Zero", "zero");
		book1 = b1;
		book2 = b1;
		book3 = b1;
	}
	public Patron(String yourName)
	{
		patron1 = yourName;
	}
	public void setName(String yourName) 
	{
		patron1 = yourName;
	}
	public boolean borrowBook(Book book) 
	{
		if (book1 == null)
		{
			book1 = book;
			return true;
		}
		else if(book2 == null)
		{
			book2 = book;
			return true;
		}
		else if(book3 == null)
		{
			book3 = book;
			return true;
		}
		return false;
	}
	public boolean returnBook(String title) 
	{
		if(book1.equals(title))
		{
			book1 = null;
			return true;
		}
		else if(book2.equals(title))
		{
			book2 = null;
			return true;
		}
		else if(book3.equals(title))
		{
			book3 = null;
			return true;
		}
		return false;
	}
	public String getName()
	{
		return patron1;
	}
	public boolean hasBorrowed(String titlex) 
	{
		return false;
	}
	public String toString()
	{
		String string;

		string = "Name: " + patron1 + "\n" +
				book1 + "\n" +
				book2 + "\n" +
				book3 + "\n";
		return string;

	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Patron p1 = new Patron();
		
		System.out.println("Enetr a title");
		String title1 = input.nextLine();	
		
		System.out.println("Enter Author");
		String author1 = input.nextLine();
		
		Book book1 = new Book(author1, title1);
		System.out.println(book1.toString());
		Book book23 = null;
		Book l = p1.book2;
	}
}