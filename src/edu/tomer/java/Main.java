package edu.tomer.java;


import edu.tomer.java.library.Book;

import edu.tomer.java.library.Library;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Library lib = new Library();

        //String uid = UUID.randomUUID().toString();
        //System.out.println(uid);

        //init 2 books:
        Book b1 = new Book("Java Software solutions 8th edition", "212310-2392");
        Book b2 = new Book("Java in a nutshell 6th edition", "4090923-023039");

        //add the books to the library:
        lib.addBook(b1);
        lib.addBook(b2);

        lib.printBooks();




        //secure the integrity
        //

        edu.tomer.java.ebooks.Book book = new edu.tomer.java.ebooks.Book();


    }
}
