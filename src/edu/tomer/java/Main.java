package edu.tomer.java;


import edu.tomer.java.library.Book;

import edu.tomer.java.library.Library;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(20, 20);
        Point p2 = new Point(20, 40);

        System.out.println(p1);
        System.out.println(p2);

        p2 = p1;
        p2.x = 100;

        System.out.println(p1);

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
