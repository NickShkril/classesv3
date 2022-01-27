package ru.skypro;

public class Main {


    public static void main(String[] args) {
        Author newAuthor = new Author("Joan ", "Roaling");
        Book potter = new Book("Harry Potter", newAuthor, 1997);
        potter.setPublicationYear(2021);
        System.out.println("Название книги " + potter.getTitleBook());
        System.out.println("Год публикации " + potter.getPublicationYear());
        System.out.println("Автор " + potter.getAuthor().getAuthor());
        System.out.println();
        Book potterTwo = new Book("Harry potter and Chamber of the Secrets", new Author("Joan ", "Roaling"), 2000);
        System.out.println("Название книги " + potterTwo.getTitleBook());
        System.out.println("Год публикации " + potterTwo.getPublicationYear());
        System.out.println("Автор " + potterTwo.getAuthor().getAuthor());
    }
}