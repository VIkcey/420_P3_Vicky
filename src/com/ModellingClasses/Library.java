package com.ModellingClasses;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library, ensuring it's unique
    public boolean addBook(Book book) {
        if (!isBookUnique(book)) {
            return false;
        }
        books.add(book);
        return true;
    }

    // Remove a book from the library by title
    public boolean removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    // Search for a book by title
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    // Helper method to check if the book is unique
    private boolean isBookUnique(Book book) {
        for (Book b : books) {
            if (b.equals(book)) {
                return false;
            }
        }
        return true;
    }

    // Method to print all books (for testing purposes)
    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }


    public class Book {

        //Constructor
        public Book(String title, String author, int numberOfPages) {
            //    Fields
        }


        public Object getTitle() {
            return  "";
        }

    }
}