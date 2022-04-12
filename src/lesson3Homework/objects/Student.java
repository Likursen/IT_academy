package lesson3Homework.objects;

public class Student implements Comparable<Student>{
    private final int DEFAULT_ID = 0;
    private final int DEFAULT_AGE = 0;
    private int id = DEFAULT_ID;
    private int age = DEFAULT_AGE;
    private String name;

    public Student() {
    }

    public Student(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student students)) return false;

        if (id != students.id) return false;
        return age == students.age;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "\nStudents{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }
}
