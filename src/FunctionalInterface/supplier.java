package FunctionalInterface;
import java.util.function.Supplier;
public class supplier{
    public static void main(String[] args) {

        Supplier<String> message = () -> "bharathi";

        System.out.println(message.get());
    }
}
