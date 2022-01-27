package ru.skypro;

public class Author {
    String authorfirstName;
    String authorlastName;

    public Author(String firstName, String lastName) {
        this.authorfirstName = firstName;
        this.authorlastName = lastName;
    }

    public String getAuthor() {
        return authorfirstName + authorlastName;
    }
}

