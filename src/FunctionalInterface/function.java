package FunctionalInterface;
import java.util.function.Function;

public class function {

         static void main()
        {
            //apply

            Function<Integer, Double> half = a -> a / 2.0;

            System.out.println(half.apply(40));
        }
    }

// it have more some methods

/*
1.  apply() - takes input returns the output
2.  andThen() - execute current func first then next.
3.  compose() -  execute other func first then next.
4.  identify() - return same input without modifying it .

*/
