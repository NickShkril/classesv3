package ru.skypro;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private final String titleBook;
    private final Author author;
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

    @Override
    public String toString() {
        return "Book Title: " + titleBook + ", " + author + ", " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(titleBook, book.titleBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, author, publicationYear);
    }
}

