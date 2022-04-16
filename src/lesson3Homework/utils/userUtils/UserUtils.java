package lesson3Homework.utils.userUtils;

import lesson3Homework.domain.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class UserUtils {
    private static final int DEFAULT_COUNT_OF_FRIENDS = 2;    //default count friends for every user

    public static void addFriendToUser(User user, int nestingLevel) {
        //method adds friend to given user up to the given level of nesting
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

    public static void printFriendOfUser(User user, int nestingLevel) {
        //method formed friendship hierarchy of given user up to the given level of nesting
        List<User> users = new LinkedList<>();
        users.add(user);
        printHierarchyOfFriends(users, nestingLevel);
    }

    public static void printHierarchyOfFriends(List<User> users, int generation) {
        //method print friendship hierarchy up to the given level of nesting
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

    public static User getRandomUser() {
        //method return user with random parameters
        return new User(getRandomId(), getRandomName(), getRandomString());
    }

    private static long getRandomId() {
        //method return random ID the order
        int boundOfId = 999;
        return new Random().nextInt(boundOfId);
    }

    private static String getRandomName() {
        //method return random name from given in User class names array
        Random random = new Random();
        int randomIndex = random.nextInt(User.getNames().length);
        return User.getNames()[randomIndex];
    }

    private static String getRandomString() {
        //method return random lower case string with default length
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