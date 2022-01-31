package ru.skypro;

public class Main {


    public static void main(String[] args) {

        Book potter = new Book("Harry Potter", new Author("Joan", "Roaling"), 1997);

        potter.setPublicationYear(2021);
        System.out.println(potter);
        Book potterTwo = new Book("Harry potter and Chamber of the Secrets", new Author("Joan ", "Roaling"), 2000);
        System.out.println(potterTwo);

        //System.out.println("Название книги " + potter.getTitleBook());
        //System.out.println("Год публикации " + potter.getPublicationYear());
        //System.out.println("Автор " + potter.getAuthor().getAuthorFullName());
        //System.out.println();
        //System.out.println("Название книги " + potterTwo.getTitleBook());
        //System.out.println("Год публикации " + potterTwo.getPublicationYear());
        //System.out.println("Автор " + potterTwo.);
        System.out.println("author and year Equal is " + potter.equals(potterTwo));
        System.out.println("Hash equal is " + (potter.hashCode() == potterTwo.hashCode()));
        //System.out.println();
        //Author author1 = new Author("Joan", "Roaling");
        //Author author2 = new Author("Joan", "Roaling");
        //System.out.println("Author is equal " + author1.equals(author2));
        //System.out.println();
        //Book potter1 = new Book("Harry potter", author1, 1997);
        //Book potter2 = new Book("Harry potter", author2, 1997);
        //System.out.println("Author is equal " + potter1.equals(potter2));
    }
}
