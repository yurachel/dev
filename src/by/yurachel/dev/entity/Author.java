package by.yurachel.dev.entity;

public class Author {
    private String lastName;
    private String initials;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Author(String lastName, String initials) {
        this.lastName = lastName;
        this.initials = initials;
    }

    @Override
    public String toString() {
        return lastName + " " + initials;
    }
}

