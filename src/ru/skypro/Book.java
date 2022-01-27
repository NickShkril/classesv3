package ru.skypro;

import java.time.LocalDate;

public class Book {
    private final String titleBook;
    private Author author;
    private int publicationYear;

    public Book(String titleBook, Author author, int publicationYear) {
        this.titleBook = titleBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitleBook() {
        return this.titleBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        int currentYear = LocalDate.now().getYear();
        if (publicationYear < 1800 || publicationYear > currentYear) {
            System.out.println("Invalid publishin year parametr: " + publicationYear);
            return;
        }
        this.publicationYear = publicationYear;
    }
}

