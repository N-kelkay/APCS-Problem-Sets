package net.mrpaul.ads.csid.ps06;
/**
*The class allows the person to set title to a book and set the authors name
*
*The class first starts off with constructors the getter and setters 
 the methods to setTitle, Set Author, etc<p> HTML tag.
*<p>
*APCS PS150: Problem set 06 Cartesian
*Date 11/17/2017
* 
*
*@author Natenael Kelkay
*/
public class Book {
	private String title, author;

	public Book(){
		title = "";
		author = "";

	}
	public Book(String title){
	this.title = title;
	}

	public Book(String author, String book){
		this.author = author;
		this.title = book;
	}
	public String getTitle() {
		return title;
	}	
	public void setBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String toString(){
		return ("Book Title: " + title + "\n" + "Book Author: " + author + "\n");
	}
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setBook("Joy Luck Club" , "Amy Tan");
		System.out.println(b1.toString());
		
	}

}