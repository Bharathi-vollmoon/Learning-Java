package MethodReference;
import java.util.*;

public class InstanceMethodArbitaryObject {

    static void main() {
        List<String> names = Arrays.asList("Bharathi","Arun","Deepak");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}

