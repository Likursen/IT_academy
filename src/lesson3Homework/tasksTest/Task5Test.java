package lesson3Homework.tasksTest;

import lesson3Homework.domain.User;
import lesson3Homework.utils.user.UserUtils;

public class Task5Test {
    public static void main(String[] args) {
        int nestingLevel = 5;
        // create user with random parameters
        User user = UserUtils.getRandomUser();

        //adds friend to user up to the given level of nesting
        UserUtils.addFriendToUser(user, nestingLevel);

        //print friends of user up to the given level of nesting
        UserUtils.printFriendOfUser(user, nestingLevel);
    }
}
