package test.annotation.starter;

import test.annotation.utils.AnnotationInfo;

import java.io.IOException;
import java.net.URISyntaxException;

public class Task2Starter {
    public static void main(String[] args) throws IOException, URISyntaxException {
        //the path of the directory in which to search for classes
        String path = "test.annotation";
        //output to the console of annotated classes with their annotated fields and methods
        AnnotationInfo.printAnnotated(path);
    }
}
