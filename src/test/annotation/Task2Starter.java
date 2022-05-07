package test.annotation;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Task2Starter {
    public static void main(String[] args) throws IOException, URISyntaxException {
        List<Class<?>> classes =  ClassFinder.find("test.annotation");
        for (Class<?> aClass : classes) {
            if (aClass.isAnnotationPresent(Task2Anno.class)){
                System.out.println(aClass);
            }
        }
    }
}
