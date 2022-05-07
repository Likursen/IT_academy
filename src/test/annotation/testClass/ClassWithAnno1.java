package test.annotation.testClass;

import test.annotation.annotation.Task2Anno;

@Task2Anno()
public class ClassWithAnno1 {
    @Task2Anno
    int a = 2;
    int b = 6;

    @Task2Anno
    private static int methodWithAnno1(int a, int b) {
        return a + b;
    }

    private static int methodWithoutAnno1(int a, int b) {
        return a * b;
    }
}
