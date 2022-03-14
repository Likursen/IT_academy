package test;

public class Cat {
    private int age;
    private String ownerFullName;
    private double weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Cat() {
        setAge(0);
        setOwnerFullName("unknown");
        setWeight(0);

    }

    public Cat(int age, String ownerFullName, double weight) {
        setAge(age);
        setOwnerFullName(ownerFullName);
        setWeight(weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (Double.compare(cat.weight, weight) != 0) return false;
        return ownerFullName.equals(cat.ownerFullName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        result = 31 * result + ownerFullName.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", ownerFullName='" + ownerFullName + '\'' +
                ", weight=" + weight +
                '}';
    }
}



