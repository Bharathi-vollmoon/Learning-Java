import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamList {
   public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6,5,2,1));

        list.stream()
                .filter(n -> n %2 == 0)
                .forEach(n -> System.out.println(n));
       System.out.println("---------------------------------");
        list.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
       System.out.println("---------------------------------");

       list.stream()
               .sorted()
               .forEach(n -> System.out.println(n));
       System.out.println("---------------------------------");


           list.stream()
                   .limit(5)
                   .forEach(n -> System.out.println(n));
       System.out.println("---------------------------------");

       list.stream()
               .skip(3)
               .forEach(num -> System.out.println(num));

       System.out.println("---------------------------------");

   }
}
