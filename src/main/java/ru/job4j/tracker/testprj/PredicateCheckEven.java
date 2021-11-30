package ru.job4j.tracker.testprj;

import java.util.function.Predicate;

public class PredicateCheckEven {

    public static boolean check(int num) {
        System.out.println("a2");
        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;
        Predicate<Integer> isPositiveNumber = x -> x > 0;
        return check(isEvenNumber.and(isPositiveNumber), num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        System.out.println("a1");
        return predicate.test(num);
    }

    public static void main(String[] args) {
        System.out.println(PredicateCheckEven.check(-1));
    }
}
