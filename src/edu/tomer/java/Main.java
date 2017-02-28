package edu.tomer.java;


import edu.tomer.java.library.Book;

import edu.tomer.java.library.Library;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //primitive: value types
        //int, char, boolean, double, float
        //passed via copy.


        //Reference types: Object
        //Capital letter - Classes only
        //String...Person...Student...Trivia...Random ->new
        //passed via reference. the receiver gets a reference. not a copy!

        Book b = new Book("Intro to java", "2134-4324");
        changeTheBook(b);
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
