package edu.tomer.java;


import edu.tomer.java.library.Book;

import edu.tomer.java.library.Library;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       Library lib = new Library();
       lib.addBook(new Book("Java time" ,"dfsoi302-200-e3"));
       lib.printBooks();
        //pointer
        //objects are passed by ref.
        ArrayList<Book> books = lib.getBooks();
        books.clear();
        books.add(new Book("Your encapsulation has been hacked" ,"123"));
        lib.printBooks();
    }

    //gets a reference
    //if
    public static void changeTheBook(Book b){
        b.setName("The Intro to java");
    }

    //gets a copy
    public static int changeIt(int x){
        x = x+1;
        return x;
    }
    private static void print(int[] arr) {
        for (int item : arr) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }

    public static void sort(int[] arr){
        Arrays.sort(arr);
    }
}
