package by.tmc.c30.lesson10object.user;

import java.util.Objects;

public class EmailUser {
    private final String ID_USER;
    private String loginUser;
    private final String E_MAIL;
    private String hashPassword;

    public EmailUser(User user) {
        this.ID_USER = user.getID();
        this.loginUser = user.getName().concat(user.getFamily());
        this.E_MAIL = user.getName() + "." + user.getFamily() + "@" + "company.com";
        this.hashPassword = String.valueOf(user.getName().concat(user.getFamily()).hashCode());
//        System.out.println(this);
//        System.out.println();
    }

    @Override
    public String toString() {
        return "Email " + "\t" +
                "idUser: '" + ID_USER + '\'' + "\t" + "\t" +
                "email: '" + E_MAIL + '\'' + "\t" + "\t" +
                "hashPassword: '" + hashPassword + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailUser emailUser = (EmailUser) o;
        return Objects.equals(ID_USER, emailUser.ID_USER) &&
                Objects.equals(E_MAIL, emailUser.E_MAIL) &&
                Objects.equals(hashPassword, emailUser.hashPassword);
    }

//    @Override
//    public int hashCode() {
//        int result = Objects.hashCode(ID_USER);
//        result = 31 * result + Objects.hashCode(E_MAIL);
//        result = 31 * result + Objects.hashCode(hashPassword);
//        return result;
//    }

    public String getIdUser() {
        return ID_USER;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public String getEmail() {
        return E_MAIL;
    }

    public String getHashPassword() {
        return hashPassword;
    }
}