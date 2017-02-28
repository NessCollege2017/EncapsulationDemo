package edu.tomer.java.library;

import java.util.ArrayList;

public class Library {
    //properties: Private.
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {

    }

    public void addBook(Book b){
        books.add(b);
    }

    //getAllBooks//PrintAllBooks
    public void printBooks(){
        for (Book b : books) {
            System.out.println(b.getName());
            System.out.println(b.getISBN()+"\n");
        }
    }

    //getBooks
    public ArrayList<Book> getBooks() {
        return books;
    }
}
