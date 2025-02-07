package org.astondreamteam.classes;

public class User {
    private String name;
    private String password;
    private String mail;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.password = userBuilder.password;
        this.mail = userBuilder.mail;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public static class UserBuilder {
        private String name;
        private String password;
        private String mail;

        UserBuilder(String name) {
            this.name = name;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setMail(String mail) {
            this.mail = mail;
            return this;
        }

        public User createUser() {
            return new User(this);
        }
    }

//    public static void main(String[] args) {
//        User user = new UserBuilder("Annie").createUser();
//        System.out.println(user.getName());
//    }
}
