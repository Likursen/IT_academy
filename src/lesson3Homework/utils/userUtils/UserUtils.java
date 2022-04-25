package lesson3Homework.utils.userUtils;

import lesson3Homework.domain.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class UserUtils {
    private static final int DEFAULT_COUNT_OF_FRIENDS = 2;    //default count friends for every user

    //method adds friend to given user up to the given level of nesting
    public static void addFriendToUser(User user, int nestingLevel) {
        List<User> userFriends = user.getFriends();
        if (nestingLevel == 0) {
            return;
        }
        for (int i = 0; i < DEFAULT_COUNT_OF_FRIENDS; i++) {
            userFriends.add(getRandomUser());
        }
        for (User friend : userFriends) {
            addFriendToUser(friend, nestingLevel - 1);
        }
    }

    //method formed friendship hierarchy of given user up to the given level of nesting
    public static void printFriendOfUser(User user, int nestingLevel) {
        List<User> users = new LinkedList<>();
        users.add(user);
        printHierarchyOfFriends(users, nestingLevel);
    }

    //method print friendship hierarchy up to the given level of nesting
    public static void printHierarchyOfFriends(List<User> users, int generation) {
        if (generation == 0) {
            return;
        }
        List<User> allFriends = new ArrayList<>();
        System.out.println("generation");
        for (User user : users) {
            List<User> userFriends = user.getFriends();
            System.out.print(user.getName() + ": ");
            for (User userFriend : userFriends) {
                allFriends.add(userFriend);
                System.out.print(userFriend.getName() + " ");
            }
            System.out.println();
        }
        System.out.println();
        printHierarchyOfFriends(allFriends, generation - 1);
    }

    //method return user with random parameters
    public static User getRandomUser() {
        return new User(getRandomId(), getRandomName(), getRandomString());
    }

    //method return random ID the order
    private static long getRandomId() {
        int boundOfId = 999;
        return new Random().nextInt(boundOfId);
    }

    //method return random name from given in User class names array
    private static String getRandomName() {
        Random random = new Random();
        int randomIndex = random.nextInt(User.getNames().length);
        return User.getNames()[randomIndex];
    }

    //method return random lower case string with default length
    private static String getRandomString() {
        int targetStringLength = 4;
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}