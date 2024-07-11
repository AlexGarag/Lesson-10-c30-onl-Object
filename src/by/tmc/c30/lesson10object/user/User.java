package by.tmc.c30.lesson10object.user;

import java.util.Objects;

public class User {
    private final String ID_USER;
    protected String name;
    protected String family;
    EmailUser emailUser;

    public User(User user) {
        ID_USER = user.getID();
        name = user.getName();
        family = user.getFamily();
        emailUser = new EmailUser(user);
    }

    public User(String nameUser, String familyUser) {
        name = nameUser;
        family = familyUser;
        ID_USER = String.valueOf(nameUser.concat(familyUser).concat(String.valueOf(System.currentTimeMillis())).hashCode());
        emailUser = new EmailUser(this);
    }

    @Override
    public String toString() {
        return "User " + "\t" +
                "id: '" + ID_USER + '\'' + "\t" + "\t" +
                "name: '" + name + '\'' + "\t" + "\t" +
                "family: '" + family + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(ID_USER, user.ID_USER)
                && Objects.equals(name, user.name)
                && Objects.equals(family, user.family);
    }

//    @Override
//    public int hashCode() {
//        int result = Objects.hashCode(ID_USER);
//        result = 31 * result + Objects.hashCode(name);
//        result = 31 * result + Objects.hashCode(family);
//        return result;
//    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getID() {
        return ID_USER;
    }

    public EmailUser getEmail() {
        return emailUser;
    }

    @Override
    public User clone() {
        return new User(this);
    }
}