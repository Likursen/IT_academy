package lesson3Homework.domain;

import java.util.LinkedList;
import java.util.List;

public class User {
    private final long DEFAULT_USER_ID = 0;
    private final String DEFAULT_USER_NAME = "User name not set";
    private final String DEFAULT_USER_SURNAME = "User surname not set";
    private final List<User> DEFAULT_USER_FRIEND = new LinkedList<>();

    private long id = DEFAULT_USER_ID;
    private String name = DEFAULT_USER_NAME;
    private String surname = DEFAULT_USER_SURNAME;
    private List<User> friends = DEFAULT_USER_FRIEND;
    private static String[] names = {"первый", "второй", "третий", "четвертрый", "пятый",
            "шестой", "седьмой", "восьмой", "девятый", "нулевой"};

    public User() {
    }

    public User(long id, String name, String surname, List<User> friends) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.friends = friends;
    }

    public User(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public static String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        User.names = names;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", friends=" + friends +
                '}';
    }
}
