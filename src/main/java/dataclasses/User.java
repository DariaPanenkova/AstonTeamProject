package dataclasses;

import java.util.Objects;

public class User {
    private final String name;
    private final String password;
    private final String mail;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bus)) {
            return false;
        }
        User user = (User) obj;
        return Objects.equals(name, user.name)
                && Objects.equals(password, user.password)
                && Objects.equals(mail, user.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, mail);
    }

    @Override
    public String toString() {
        return "Имя пользователя: " + name + " " + "Пароль: " + password + " Почта: " + mail;
    }

    public static class UserBuilder {
        private String name;
        private String password;
        private String mail;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
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
}
