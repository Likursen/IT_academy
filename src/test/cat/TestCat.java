package test.cat;

public class TestCat {
    public static void main(String[] args) {
        Cat catOne = new Cat();
        Cat catTwo = new Cat(10, "Ivan", 8.23);
        System.out.println("***************");
        System.out.println(catOne);
        System.out.println(catTwo);
        System.out.println("***************");
        System.out.println(catOne.hashCode());
        System.out.println(catTwo.hashCode());
        System.out.println("***************");
        System.out.println(catOne.equals(catTwo));
    }
}
