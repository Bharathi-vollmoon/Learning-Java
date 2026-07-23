package FunctionalInterface;

import java.util.function.Predicate;

public class predicate  {
    static void main() {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(3));
    }
}
