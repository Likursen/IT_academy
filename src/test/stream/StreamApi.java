package test.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {
//    List<Integer> list = Arrays.asList(111, 222, 333, 777, 999, 777)
//1. Вывести сумму всех элементов коллекции
//2. Вывести 3 и 4 элементы отсортированной коллекции
//3. Вывести отсортированный список чисел от большего к меньшему в виде строки с разделителями между элементами

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(111, 222, 333, 777, 999, 777);
        //1. Вывести сумму всех элементов коллекции
        Optional<Integer> task1 = list
                .stream()
                .reduce(Integer::sum);
        System.out.println(task1);
        //2. Вывести 3 и 4 элементы отсортированной коллекции
        List<Integer> task2 = list
                .stream()
                .sorted()
                .skip(2)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(task2);
        //3. Вывести отсортированный список чисел от большего к меньшему в виде строки с разделителями между элементами
        String task3 = list
                .stream()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(task3);
    }
}

