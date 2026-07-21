import java.util.*;
interface Greeting{
    public void SayHello();
}
interface Addition{
    int Add(int a,int b);
}
interface Multi{
    int multiple(int a);
}

public class LambdaExpressions {
    public void main(String[] args) {

        //simple lambda

        Greeting say = () -> System.out.println("hello world");
        say.SayHello();

        //lambbda with parameters

        Addition addition = (a, b) -> a + b;
        System.out.println(addition.Add(10, 20));

        //lambda with multiple statements

        Multi multi = (a) -> {
            int result = a * a;
            return result;
            };
        System.out.println(multi.multiple(4));

    }
}
