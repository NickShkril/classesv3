package ru.skypro;

public class Main {


    public static void main(String[] args) {

        Book potter = new Book("Harry Potter", new Author("Joan", "Roaling"), 1997);

        potter.setPublicationYear(2021);
        System.out.println(potter);
        Book potterTwo = new Book("Harry Potter and the chamber of secrets", new Author("Joan", "Roaling"), 1997);
        System.out.println(potterTwo);
        System.out.println("author and year Equal is " + potter.equals(potterTwo));
        System.out.println("Hash equal is " + (potter.hashCode() == potterTwo.hashCode()));
    }
}
