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
        return "titleBook{" +
                "Title Book='" + titleBook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        return Objects.equals(publicationYear, titleBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, publicationYear);
    }
}

