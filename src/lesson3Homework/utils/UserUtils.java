package lesson3Homework.utils;

import lesson3Homework.objects.User;

import java.util.List;
import java.util.Random;

public class UserUtils {
    private static final int DEFAULT_COUNT_OF_FRIENDS = 2;

    public static void addFriendToUser(User user, int generation) {
        List<User> userFriends = user.getFriends();
        if (generation == 0) {
            return;
        }
        for (int i = 0; i < DEFAULT_COUNT_OF_FRIENDS; i++) {
            userFriends.add(getRandomUser());
        }
        for (User friend : userFriends) {
            addFriendToUser(friend, generation - 1);
        }
    }


    public static void printFriendOfUser(User user, int generation) {
        List<User> userFriends = user.getFriends();
        if (generation == 0) {
            return;
        }
        for (int i = 0; i < userFriends.size()-1; i++) {
            System.out.print(userFriends.get(i).getName());
        }
        System.out.println("");
        for (User friend : userFriends) {
            printFriendOfUser(friend, generation - 1);
        }
    }


    public static User getRandomUser() {
        return new User(getRandomId(), getRandomName(), getRandomString());
    }

    private static long getRandomId() {
        int minId = 100;
        int maxId = 999;
        return new Random().nextLong(minId, maxId);
    }

    private static String getRandomName() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(User.getNames().length);
        return User.getNames()[randomIndex];
    }

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