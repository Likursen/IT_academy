package test.annotation.testClass;

public class ClassWithoutAnno3 {
    int a = 2;
    int b = 6;

    private static int methodWithAnno3(int a, int b) {
        return a * -b;
    }

    private static int methodWithoutAnno3(int a, int b) {
        return a / -b;
    }
}
