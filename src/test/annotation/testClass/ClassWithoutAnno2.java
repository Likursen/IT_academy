package test.annotation.testClass;

public class ClassWithoutAnno2 {
    int a = 2;
    int b = 6;

    private static int methodWithAnno2(int a, int b) {
        return a - b;
    }

    private static int methodWithoutAnno2(int a, int b) {
        return a / b;
    }
}
