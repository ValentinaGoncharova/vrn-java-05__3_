package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        int result = reverse(firstNumber) + reverse(secondNumber);
        return result;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        ArrayList<T> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            resultList.add(list.get(i));
        }
        return resultList;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        ArrayList<T> resultList = new ArrayList<>();
        if (list.size() != 0) {
            resultList.add(list.get(0));
            if (list.size() > 1)
                resultList.add((list.get(list.size() - 1)));
        }
        return resultList;
    }


    private int reverse(List<Integer> inputList) {
        int revers = 0;
        for (int i = inputList.size() - 1; i >= 0; i--) {
            revers = revers * 10;
            revers = revers + inputList.get(i);
        }
        return revers;
    }
}
