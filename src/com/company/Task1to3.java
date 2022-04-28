package com.company;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task1to3 {
    public static void main(String[] args) {
        String[] fruits = {"orange", "apple", "peach", "apricot", "cherry"};
        String[] food = Arrays.copyOf(fruits, 5);
        Stream.of(food).forEach(System.out::println);

    }
}
