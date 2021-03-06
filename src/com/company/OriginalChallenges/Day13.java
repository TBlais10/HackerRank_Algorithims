package com.company.OriginalChallenges;

// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable


public class Day13 {

    abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    /**
     * Class Constructor
     *
     * @param title  The book's title.
     * @param author The book's author.
     * @param price  The book's price.
     **/
    class MyBook extends Book {

        int price;

        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        public void display() {
            System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
        }
    }
/**
 *   Method Name: display
 *
 *   Print the title, author, and price in the specified format.
 **/
// Write your method here

// End class


}
