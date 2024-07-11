import by.tmc.c30.lesson10object.user.User;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        User userA = new User("John", "Doe");
//        User userB = new User("Jane", "Doe");

        User userCloneA = userA.clone();

        if ((userCloneA.equals(userA) && userCloneA.hashCode() != userA.hashCode()) &&
                (userCloneA.getEmail().equals(userA.getEmail()) && userCloneA.getEmail().hashCode() != userA.getEmail().hashCode())) {
            System.out.println("Cloned user A");
        }
        int i = 0;
    }
}