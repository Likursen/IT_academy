package test.annotation.testClass;

import test.annotation.Task2Anno;

public class ClassWithoutAnno1 {
    int a = 2;
    int b = 6;

    private static int methodWithAnno1(int a, int b) {
        return a + b;
    }

    private static int methodWithoutAnno1(int a, int b) {
        return a * b;
    }
}
