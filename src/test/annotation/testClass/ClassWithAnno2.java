package test.annotation.testClass;

import test.annotation.Task2Anno;

@Task2Anno()
public class ClassWithAnno2 {
    int a = 2;
    @Task2Anno
    int b = 6;

    @Task2Anno
    private static int methodWithAnno2(int a, int b) {
        return a - b;
    }

    private static int methodWithoutAnno2(int a, int b) {
        return a / b;
    }
}
