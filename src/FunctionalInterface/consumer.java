package FunctionalInterface;

import java.util.function.Consumer;

public class consumer {
    static void main() {

        Consumer<String> a = n -> System.out.println("welcome "+n);

        a.accept("bharathi");

        Consumer<String> b = n -> System.out.println("hi "+n);
        Consumer<String> c = n -> System.out.println("hello "+n);
//create new consumer d
        Consumer<String> d = b.andThen(c);
        d.accept("bharathi");
    }
}
