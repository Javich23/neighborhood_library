package com.library;
import java.util.Scanner;



public class BookStore {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        Book[] booksAvailable = Book.booksAvailable;
        boolean done = false;
        while (!done) {
            System.out.println("----------Welcome to the Neighborhood Library------------ \n");
            System.out.println("Choose one of the following options (enter number) : \n");
            System.out.println("""
                    1 - Available Books\s
                    2 - Checked Out Books\s
                    3 - Exit Library\s
                    """);
            int homeChoice = consoleInput.nextInt();
            consoleInput.nextLine();
            switch (homeChoice) {
                case 1:
                    for (Book i : booksAvailable) {
                        if (i.isCheckedOut()) continue;
                        {
                            System.out.println("Title: " + i.getTitle() + ",  ISBN: " + i.getIsbn() + ",  ID: " + i.getId());
                        }
                    }
                    System.out.println("\nWould you like to check out a book? (Y or N) \n ");
                    String answer = consoleInput.nextLine();
                    switch (answer.toUpperCase()) {
                        case "Y":
                            System.out.print("Enter 4 digit ID of book: ");
                            int iD = consoleInput.nextInt();
                            consoleInput.nextLine();
                            for (Book b : booksAvailable) {
                                if (b.getId() == iD) {
                                    System.out.print("Please enter your name: ");
                                    String name = consoleInput.nextLine().trim();
                                    b.checkOut(name);
                                    System.out.println("You have checked out the book: " + b.getTitle());
                                    System.out.println("Would you like to check out another book: ");
                                    System.out.println("Returning to home screen\n");
                                }
                            }
                            break;
                        case "N":
                            System.out.println("Returning to home screen ");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("These are the checked out books: ");
                    for (Book c : booksAvailable) {
                        if (!c.isCheckedOut()) continue;
                        {
                            System.out.println(c.getTitle() + " / " + c.getIsbn() + " / " + c.getId());
                        }
                    }
                    System.out.println("\nWould you like to check in a book? \n ");
                    System.out.println("Press C for yes ");
                    System.out.println("Press X for no ");
                    String response = consoleInput.nextLine();
                    switch (response.toUpperCase()) {
                        case "C":
                            System.out.print("Enter 4 digit ID of book: ");
                            int iD = consoleInput.nextInt();
                            consoleInput.nextLine();
                            for (Book b : booksAvailable) {
                                if (b.getId() == iD) {
                                    System.out.println("You have checked in the book: " + b.getTitle() + "\n");
                                    b.checkIn();
                                    System.out.println("Returning to home screen \n");
                                }
                            }
                            break;
                        case "X":
                            System.out.println("Returning to home screen \n");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Exiting library, Have a great day ");
                    done = true;
                    break;
                default:
                    System.out.println("Wrong input, please try again\n");
                    break;
            }
        }
    }
}