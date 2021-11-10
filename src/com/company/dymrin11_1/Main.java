package com.company.dymrin11_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Dog");
        strings.add("Cat");
        strings.add("Dog");
        strings.add("Fish");
        strings.add("Cow");
        strings.add("Piggy");
        strings.add("Bull");
        strings.add("Dog");
        strings.add("Kitty");
        strings.add("Snake");

        countOccurance(strings, "Dog");

        System.out.println(toList(new int[]{1, 2, 3, 4}));

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(5);
        integers.add(4);
        integers.add(2);
        integers.add(8);
        integers.add(5);
        integers.add(7);
        integers.add(9);
        integers.add(1);
        integers.add(2);
        integers.add(5);

        System.out.println(findUnique(integers));


    }

    /*
    Создать метод countOccurance, принимающий на вход строковый список в качестве параметра и произвольную строку.
    Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
    Посчитать сколько раз встречается переданная строка в качестве второго аргумента.
    */
    public static void countOccurance(List<String> strings, String target) {
        int count = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals(target)) {
                count++;
            }

        }
        System.out.println(count);

    }

    /*
    Создать метод toList, принимающий на вход целочисленный массив произвольной длины. Конвертировать массив в список соответствующего типа данных и вернуть из метода.
    Например:
    Было Array [1, 2, 3]
    Стало List [1, 2, 3]
    */
    public static List<Integer> toList(int[] digits) {
        List<Integer> newDigits = new ArrayList<>(digits.length);
        for (int i = 0; i < digits.length; i++) {
            newDigits.add(digits[i]);
        }
        return newDigits;
    }


    /*
    Создать метод findUnique, принимающий на вход числовой список состоящий из произвольных значений, которые могут повторяться в неограниченном количестве.
    Необходимо вернуть новый числовой список содержащий только уникальные числа.
    */
    public static List<Integer> findUnique(List<Integer> digits) {
        List<Integer> unique = new ArrayList<>();
        for (Integer digit : digits) {
            if (!unique.contains(digit)) {
                unique.add(digit);
            }

        }
        return unique;
    }


}

