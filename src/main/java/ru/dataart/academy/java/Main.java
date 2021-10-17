package ru.dataart.academy.java;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Calculator works: " + calculator.getSum(Arrays.asList(1, 6, 4), Arrays.asList(3, 2)));
        System.out.println("Odd elements: " + calculator.getOddElements(Arrays.asList("One", "Two")));
        System.out.println("Bounds: " + calculator.getBounds(Arrays.asList("One", "Two")));
    }
}