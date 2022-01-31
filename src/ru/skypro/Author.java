package ru.skypro;

public class Author {
    private final String authorFirstName;
    private final String authorLastName;

    public Author(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getAuthorFullName() {
        return authorFirstName + authorLastName;
    }
}