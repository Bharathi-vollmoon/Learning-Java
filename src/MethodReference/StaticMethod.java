package MethodReference;
import java.util.*;


public class StaticMethod {

    public static void Static(int s){
        System.out.println(s);
    }
    public static void Square(int g){
        System.out.println(g*g);
    }
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(9,2,4,1);

        numbers.stream()
                .sorted()
                .forEach(StaticMethod::Static);
        System.out.println("------------------------------");
        numbers.stream()
                .map(s ->s*s)
                .forEach(StaticMethod::Static);
        System.out.println("------------------------------");
         numbers.forEach(StaticMethod::Square);
    }
}

