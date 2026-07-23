package FunctionalInterface;

interface sum{
    int calculate(int x);
}

public class Example {
    public static void main(String args[]){

        int a = 4;

        sum s = (int x) -> x*x;

            int answer = s.calculate(a);
        System.out.println(answer);

    }
}
