package test.annotation.testClass;

import test.annotation.annotation.Task2Anno;

@Task2Anno()
public class ClassWithAnno3 {
    @Task2Anno
    int a = 2;
    @Task2Anno
    int b = 6;

    @Task2Anno
    private static int methodWithAnno3(int a, int b) {
        return a * -b;
    }

    @Task2Anno
    private static int methodWithAnno31(int a, int b) {
        return a / -b;
    }
}
