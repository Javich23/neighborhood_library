package com.library;

import java.util.Scanner;

public class Book {
    public static Book[] booksAvailable = {
            new Book(1004, "978-3-16-148410-0", "Hansel & Gretel", "", false),
            new Book(1005, "978-3-16-148590-0", "Rapunzel", "", false),
            new Book(1006, "978-3-16-134410-0", "Little Red Riding Hood", "", false),
            new Book(1007, "978-3-16-145310-0", "The Ugly Duckling", "", false),
            new Book(1008, "978-3-45-148410-0", "Pinocchio", "", false)

    };
    int id;
    String isbn;
    String title;
    boolean isCheckedOut;
    String checkedOutTo;

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public Book(int id, String isbn, String title, String checkedOutTo, boolean isCheckedOut) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.checkedOutTo = checkedOutTo;
        this.isCheckedOut = isCheckedOut;
    }
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut(String name){
        isCheckedOut = true;
        checkedOutTo = name;
    }

    public void checkIn(){
        isCheckedOut = false;
        checkedOutTo = "";
    }
}




