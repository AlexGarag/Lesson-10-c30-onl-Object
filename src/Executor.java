import by.tmc.c30.lesson10object.user.User;

public class Executor {
    public static void main(String[] args) {
        System.out.println();

        User userA = new User("John", "Doe");
//        User userB = new User("Jane", "Doe");
        User userCloneA = userA.clone();
//        User userCloneB = userB.clone();

        if ((userCloneA.equals(userA) && userCloneA.hashCode() != userA.hashCode()) &&
                (userCloneA.getEmailUser().equals(userA.getEmailUser()) && userCloneA.getEmailUser().hashCode() != userA.getEmailUser().hashCode())) {
            System.out.println("Cloned userA");
        }
// тестирую: меняю аргументы у клона (включая его вложенные объекты - email)
        userCloneA.getName("David");
        userCloneA.getEmailUser().setLoginUser("222222");
//  и контролирую, чтобы не менялись аргументы "исходника"
        System.out.println(userA);
        System.out.println(userCloneA);
//        int i = 0;
    }
}