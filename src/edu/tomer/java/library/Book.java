package edu.tomer.java.library;

/**
 * Created by Android2017 on 28/02/2017.
 */
public class Book {
    //properties:
    private String name;
    private String ISBN;

    public Book(String name, String ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    //property getter
    public String getName() {
        return name;
    }

    public String getISBN() {
        return ISBN;
    }

    //property setter
    public void setName(String name) {
        validateName(name);
    }

    //private helper methods:
    private void validateName(String name) {
        if (name.length() > 3) //validate
            this.name = name;
    }
}
