package models;

public class UserCardBuild {
    private String firstName;
    private String lastName;
    private String zipCode;

    public static class Builder {
        private UserCardBuild newUser;

        public Builder() {
            this.newUser = new UserCardBuild();
        }
        public Builder withFirstName(String firstName) {
            newUser.firstName = firstName;
            return this;
        }
        public Builder withLastName(String lastName) {
            newUser.lastName = lastName;
            return this;
        }
        public Builder withZipCode(String zipCode) {
            newUser.zipCode = zipCode;
            return this;
        }
        public UserCardBuild build() {
            return newUser;
        }
    }
}
