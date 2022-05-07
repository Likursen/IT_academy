package test.annotation.utils;

import test.annotation.annotation.Task2Anno;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class AnnotationInfo {
    //    the method searches for classes in the specified directory, after which it displays only annotated
    //    classes and their marked fields and methods in the console
    public static void printAnnotated(String path) {
        List<Class<?>> annotatedClass = getAnnotatedClass(path);
        System.out.println("Annotated with @Task2Anno in " + path);
        for (Class<?> aClass : annotatedClass) {
            printAnnotatedClass(aClass);
            printAnnotatedMethods(aClass);
            printAnnotatedFields(aClass);
            System.out.println("\n");
        }
    }

    //    method returns a list of all annotated classes in the given directory
    public static List<Class<?>> getAnnotatedClass(String path) {
        List<Class<?>> classes = ClassFinder.find(path);
        List<Class<?>> annotatedClass = new LinkedList<>();
        for (Class<?> aClass : classes) {
            if (aClass.isAnnotationPresent(Task2Anno.class)) {
                annotatedClass.add(aClass);
            }
        }
        return annotatedClass;
    }

    //    the method prints to the console the names of the classes marked with the annotation from
    //    the list of marked classes located in the directory
    public static void printAnnotatedClass(Class<?> annotatedClass) {
        System.out.print("Annotated class: ");
        if (annotatedClass.isAnnotationPresent(Task2Anno.class)) {
            System.out.println(annotatedClass.getSimpleName());
        }
    }

    //    the method prints to the console the names of the methods marked with the annotation from
    //    the list of marked classes located in the directory
    public static void printAnnotatedMethods(Class<?> annotatedClass) {
        System.out.print("Annotated methods: ");
        Method[] methods = annotatedClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Task2Anno.class)) {
                System.out.print(method.getName() + " ");
            }
        }
        System.out.println();
    }

    //    the method prints to the console the names of the fields marked with the annotation from
    //    the list of marked classes located in the directory
    public static void printAnnotatedFields(Class<?> annotatedClass) {
        System.out.print("Annotated fields: ");
        Field[] fields = annotatedClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Task2Anno.class)) {
                System.out.print(field.getName() + " ");
            }
        }
    }
}
