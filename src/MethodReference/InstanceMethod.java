package MethodReference;
import java.util.Arrays;
import java.util.List;

class bike{

    //instance method create without static
    void Drive(String New){
        System.out.println(New);
    }
}
public class InstanceMethod {

    public static void main(String[] args) {
        bike bikes = new bike();
        List<String> name = Arrays.asList("hymalayan","duke","pulsar");
        name.forEach(bikes::Drive);

    }
}
