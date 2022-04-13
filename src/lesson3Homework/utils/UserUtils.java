package lesson3Homework.utils;

import lesson3Homework.objects.User;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class UserUtils {
    public static User setUserFriends(User user, int count) {
        int ii = count;
       for (int i = 0; i < count; i++) {
            user.setFriends(addFriends(user.getFriends()));
       }
        System.out.println(user.getName());
        System.out.println(user.getFriends());

        return user;
    }
//        setUserFriends(user, count--);


    public static List<User> addFriends(List<User> users) {
        for (int i = 0; i < 3; i++) {
            users.add(getRandomUser());
        }
        return users;
    }


    public static List<User> userGenerator(int countOfUsers) {
        List<User> users = new LinkedList<>();
        for (int i = 0; i < countOfUsers; i++) {
            users.add(getRandomUser());
        }
        return users;
    }

    public static User getRandomUser() {
        return new User(getRandomId(), getRandomName(), getRandomString());
    }

    private static long getRandomId() {
        int boundOfId = 999;
        return new Random().nextLong(boundOfId);
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