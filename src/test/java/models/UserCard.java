package models;

import java.util.Objects;

public class UserCard {
    private String firstName;
    private String lastName;
    private String zipCode;

    public UserCard() {
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCard userCard = (UserCard) o;
        return Objects.equals(firstName, userCard.firstName) && Objects.equals(lastName, userCard.lastName) &&
                Objects.equals(zipCode, userCard.zipCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, zipCode);
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + firstName + '\'' +
                ", password='" + lastName + '\'' +
                ", email='" + zipCode + '\'' +
                '}';
    }
}
